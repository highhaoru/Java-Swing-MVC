import controller.ContainsDuplicateControllerImpl;
import model.ContainsDuplicateModelImpl;
import view.ContainsDuplicateViewImpl;

/**
 * Main class to initialize the MVC components for the ContainsDuplicate application.
 *
 * @author Hao Jin
 */
public class Main {
  /**
   * The entry point for the Contains Duplicate Checker application.
   *
   * <p>This main method initializes the Model, View, and Controller components
   * and starts the application by making the GUI visible.
   *
   * @param args Command-line arguments (not used).
   */
  public static void main(String[] args) {
    ContainsDuplicateModelImpl model = new ContainsDuplicateModelImpl();
    ContainsDuplicateViewImpl view = new ContainsDuplicateViewImpl();
    ContainsDuplicateControllerImpl controller = new ContainsDuplicateControllerImpl(model, view);

    controller.initializeView();
  }
}
