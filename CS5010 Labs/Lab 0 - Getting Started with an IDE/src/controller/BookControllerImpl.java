package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.person.BookImpl;
import view.BookView;

/**
 * This class acts as the controller for the Book model and Book view.
 *
 * @author Hao Jin
 */
public class BookControllerImpl implements BookController {
  private final BookImpl book;
  private final BookView bookView;

  public BookControllerImpl(BookImpl book, BookView bookView) {
    this.book = book;
    this.bookView = bookView;
  }

  /**
   * Initialize the controller.
   */
  @Override
  public void init() {
    this.bookView.addUpdateButtonListener(new UpdateButtonListener());
  }

  class UpdateButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      try {
        book.setTitle(bookView.getTitle());
        book.setPrice(bookView.getPrice());
        bookView.setTitle(book.getTitle());
        bookView.setPrice(book.getPrice());

        JOptionPane.showMessageDialog(null, "Update successful!");
      } catch (Exception ex) {
        bookView.displayErrorMessage("Error updating book details");
        bookView.getUpdatedInfoLabel().setText("Updated Book: " + book.getTitle()
            + " " + book.getPrice());
      }
    }
  }
}
