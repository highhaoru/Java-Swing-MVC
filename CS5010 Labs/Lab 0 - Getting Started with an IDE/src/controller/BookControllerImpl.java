package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.person.BookImpl;
import view.BookViewImpl;

/**
 * This class acts as the controller for the Book model and Book view.
 *
 * @author Hao Jin
 */
public class BookControllerImpl implements BookController {
  private final BookImpl book;
  private final BookViewImpl bookViewImpl;

  public BookControllerImpl(BookImpl book, BookViewImpl bookViewImpl) {
    this.book = book;
    this.bookViewImpl = bookViewImpl;
  }

  /**
   * Initialize the controller.
   */
  @Override
  public void init() {
    this.bookViewImpl.addUpdateButtonListener(new UpdateButtonListener());
  }

  class UpdateButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      try {
        book.setTitle(bookViewImpl.getTitle());
        book.setPrice(bookViewImpl.getPrice());
        bookViewImpl.setTitle(book.getTitle());
        bookViewImpl.setPrice(book.getPrice());

        JOptionPane.showMessageDialog(null, "Update successful!");
      } catch (Exception ex) {
        bookViewImpl.displayErrorMessage("Error updating book details");
        bookViewImpl.getUpdatedInfoLabel().setText("Updated Book: " + book.getTitle()
            + " " + book.getPrice());
      }
    }
  }
}
