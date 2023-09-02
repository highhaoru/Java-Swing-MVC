import javax.swing.JFrame;
import javax.swing.JPanel;
import model.person.PersonImpl;
import model.person.BookImpl;
import view.PersonView;
import view.BookView;
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
    PersonView personView = new PersonView();
    BookView bookView = new BookView();

    personView.setFirstName(personImpl.getFirstName());
    personView.setLastName(personImpl.getLastName());
    personView.setYearOfBirth(personImpl.getYearOfBirth());

    bookView.setTitle(bookImpl.getTitle());
    bookView.setPrice(bookImpl.getPrice());

    // Create controllers
    PersonControllerImpl personControllerImpl = new PersonControllerImpl(personImpl, personView);
    BookControllerImpl bookControllerImpl = new BookControllerImpl(bookImpl, bookView);

    // Create integrated JFrame
    JFrame integratedView = new JFrame("Integrated View");
    integratedView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    integratedView.setSize(800, 300);

    JPanel panel = new JPanel();
    panel.add(personView.getMainPanel());  // Assuming getMainPanel() returns the main JPanel of PersonView
    panel.add(bookView.getMainPanel());  // Assuming getMainPanel() returns the main JPanel of BookView

    integratedView.add(panel);

    // Show integrated view
    integratedView.setVisible(true);
  }
}