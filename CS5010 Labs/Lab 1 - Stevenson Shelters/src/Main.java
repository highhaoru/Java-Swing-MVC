import controller.StevensonController;
import controller.WeatherController;
import model.weather.StevensonReading;
import model.weather.WeatherReading;
import view.StevensonView;
import view.WeatherView;

/**
 * Main class serves as the entry point for the weather data MVC application.
 *
 * @author Hao Jin
 */
public class Main {
  /**
   * The main method serves as the entry point for the Java application.
   * It performs the setup and initialization of the MVC components.
   *
   * @param args The command-line arguments (not used).
   */
  public static void main(String[] args) {
    // Create a new WeatherReading model instance
    WeatherReading model = new StevensonReading(1000.0, 1000.0, 500.0, 200.0);

    // Create a new WeatherView view instance
    WeatherView view = new StevensonView();

    // Create a new WeatherController controller instance
    WeatherController controller = new StevensonController(model, view);

    // Initialize the view through the controller
    controller.initView();
  }
}