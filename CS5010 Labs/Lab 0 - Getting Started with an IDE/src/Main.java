import javax.swing.JFrame;
import javax.swing.JPanel;
import model.person.PersonImpl;
import model.person.BookImpl;
import view.PersonViewImpl;
import view.BookViewImpl;
import controller.PersonControllerImpl;
import controller.BookControllerImpl;

/**
 * The main entry point for the application.
 * @author Hao Jin
 */
public class Main {
  public static void main(String[] args) {
    // Create models
    PersonImpl personImpl = new PersonImpl("John", "Doe",1696);
    BookImpl bookImpl = new BookImpl("Example Book", personImpl, 19.99f);

    // Create views
    PersonViewImpl personViewImpl = new PersonViewImpl();
    BookViewImpl bookViewImpl = new BookViewImpl();

    personViewImpl.setFirstName(personImpl.getFirstName());
    personViewImpl.setLastName(personImpl.getLastName());
    personViewImpl.setYearOfBirth(personImpl.getYearOfBirth());

    bookViewImpl.setTitle(bookImpl.getTitle());
    bookViewImpl.setPrice(bookImpl.getPrice());

    // Create controllers
    PersonControllerImpl personControllerImpl = new PersonControllerImpl(personImpl, personViewImpl);
    BookControllerImpl bookControllerImpl = new BookControllerImpl(bookImpl, bookViewImpl);

    // Initialize controllers
    personControllerImpl.init();
    bookControllerImpl.init();

    // Create integrated JFrame
    JFrame integratedView = new JFrame("Integrated View");
    integratedView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    integratedView.setSize(800, 300);

    JPanel panel = new JPanel();
    panel.add(personViewImpl.getMainPanel());  // Assuming getMainPanel() returns the main JPanel of PersonView
    panel.add(bookViewImpl.getMainPanel());  // Assuming getMainPanel() returns the main JPanel of BookView

    integratedView.add(panel);

    // Show integrated view
    integratedView.setVisible(true);
  }
}