package view;

import java.awt.event.ActionListener;
import model.weather.WeatherReading;

/**
 * WeatherView is an interface that declares methods for setting and displaying
 * weather data. Classes that implement this interface will be responsible for
 * the graphical representation of weather data.
 *
 * @author Hao Jin
 */
public interface WeatherView {

  /**
   * Set the WeatherReading object to be displayed.
   *
   * @param reading WeatherReading object
   */
  void setWeatherReading(WeatherReading reading);

  /**
   * Show an error message.
   *
   * @param errorMessage The error message to display.
   */
  void showErrorMessage(String errorMessage);

  /**
   * Adds an ActionListener for the "Get Weather Data" button.
   *
   * @param listener ActionListener
   */
  void addGetWeatherDataButtonListener(ActionListener listener);

  /**
   * Adds an ActionListener for the "Reset" button.
   *
   * @param listener ActionListener
   */
  void addResetButtonListener(ActionListener listener);

  /**
   * Returns the text from the Temperature input field.
   *
   * @return the text from the Temperature field
   */
  String getTemperatureFieldText();

  /**
   * Returns the text from the Dew Point input field.
   *
   * @return the text from the Dew Point field
   */
  String getDewPointFieldText();

  // ... (more getters for other input fields)

  /**
   * Sets the Heat Index label on the view.
   *
   * @param text the text to display on the Heat Index label
   */
  void setHeatIndexLabel(String text);

  /**
   * Sets the Relative Humidity label on the view.
   *
   * @param text the text to display on the Relative Humidity label
   */
  void setRelativeHumidityLabel(String text);

  /**
   * Returns the text from the Wind Speed input field.
   *
   * @return the text from the Wind Speed field
   */
  String getWindSpeedFieldText();

  /**
   * Returns the text from the Total Rain input field.
   *
   * @return the text from the Total Rain field
   */
  String getTotalRainFieldText();

  /**
   * Sets the Wind Chill label on the view.
   *
   * @param text the text to display on the Wind Chill label
   */
  void setWindChillLabel(String text);

  /**
   * Display the view to the user.
   */
  void display();

  /**
   * Resets the text field.
   */
  void resetFields();
}

