import controller.BookControllerImpl;
import controller.PersonControllerImpl;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.person.BookImpl;
import model.person.PersonImpl;
import view.BookViewImpl;
import view.PersonViewImpl;

/**
 * The main entry point for the application.
 *
 * @author Hao Jin
 */
public class Main {

  /**
   * The main entry point for the application.
   *
   * <p>This method initializes the models, views,
   *        and controllers for both Person and Book entities.
   * It then combines their respective views into an integrated JFrame,
   *        allowing the user to interact with both entities through a single UI window.
   * </p>
   *
   * @param args The command-line arguments. Currently not being used.
   */
  public static void main(String[] args) {
    // Create models
    PersonImpl personImpl = new PersonImpl("John", "Doe", 1696);
    final BookImpl bookImpl = new BookImpl("Example Book", personImpl, 19.99f);

    // Create views
    PersonViewImpl personViewImpl = new PersonViewImpl();
    final BookViewImpl bookViewImpl = new BookViewImpl();

    personViewImpl.setFirstName(personImpl.getFirstName());
    personViewImpl.setLastName(personImpl.getLastName());
    personViewImpl.setYearOfBirth(personImpl.getYearOfBirth());

    bookViewImpl.setTitle(bookImpl.getTitle());
    bookViewImpl.setPrice(bookImpl.getPrice());

    // Create controllers
    PersonControllerImpl personControllerImpl =
        new PersonControllerImpl(personImpl, personViewImpl);
    BookControllerImpl bookControllerImpl = new BookControllerImpl(bookImpl, bookViewImpl);

    // Initialize controllers
    personControllerImpl.init();
    bookControllerImpl.init();

    // Create integrated JFrame
    JFrame integratedView = new JFrame("Integrated View");
    integratedView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    integratedView.setSize(800, 300);

    JPanel panel = new JPanel();
    panel.add(
        // Assuming getMainPanel() returns the main JPanel of PersonView
        personViewImpl.getMainPanel());
    panel.add(
        // Assuming getMainPanel() returns the main JPanel of BookView
        bookViewImpl.getMainPanel());

    integratedView.add(panel);

    // Show integrated view
    integratedView.setVisible(true);
  }
}