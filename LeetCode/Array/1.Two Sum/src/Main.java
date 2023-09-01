import controller.TwoSumController;
import controller.TwoSumControllerImpl;
import model.TwoSumModelImpl;
import view.TwoSumViewImpl;

/**
 * Main class for the Two Sum application.
 * This class initializes the model, view, and controller components
 * and starts the application.
 */
public class Main {

  /**
   * The entry point for the Two Sum application.
   *
   * @param args Command-line arguments (not used).
   */
  public static void main(String[] args) {
    TwoSumModelImpl model = new TwoSumModelImpl();
    TwoSumViewImpl view = new TwoSumViewImpl();
    TwoSumController controller = new TwoSumControllerImpl(model, view);

    controller.run();
  }
}
