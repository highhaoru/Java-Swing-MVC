package controller;

import model.weather.StevensonReading;
import model.weather.WeatherReading;
import view.WeatherView;

/**
 * StevensonController is an implementation of the WeatherController interface.
 * It handles the interaction between the StevensonReading model and the WeatherView.
 *
 * @author Hao Jin
 */
public class StevensonController implements WeatherController {
  private WeatherReading model;
  private WeatherView view;

  public StevensonController(WeatherReading model, WeatherView view) {
    this.model = model;
    this.view = view;

    // Add action listeners to the view's buttons
    view.addGetWeatherDataButtonListener(e -> fetchAndDisplayDerivedWeatherData());
    view.addResetButtonListener(e -> resetView());
  }

  @Override
  public void initView() {
    view.display();
  }

  @Override
  public void updateModel(WeatherReading newReading) {
    model = newReading;
    view.setWeatherReading(model);
  }

  @Override
  public void setView(WeatherView view) {
    this.view = view;
  }


  private void resetView() {
    // Reset the model to its default state
    WeatherReading defaultReading = new StevensonReading(0.0, 0.0, 0.0, 0.0);
    updateModel(defaultReading);

    // Reset the view fields and labels
//    view.resetFields();  // This method needs to be implemented in your view class
  }

  // New method to fetch and display derived data
  private void fetchAndDisplayDerivedWeatherData() {
    try {
      // Fetch values from view
      double temperature = Double.parseDouble(view.getTemperatureFieldText());
      double dewPoint = Double.parseDouble(view.getDewPointFieldText());
      double windSpeed = Double.parseDouble(view.getWindSpeedFieldText());
      double totalRain = Double.parseDouble(view.getTotalRainFieldText());

      // Create a new StevensonReading object
      WeatherReading newReading = new StevensonReading(temperature, dewPoint, windSpeed, totalRain);

      // Update model and view
      updateModel(newReading);

      // Fetch derived data and display on view
      view.setHeatIndexLabel("Heat Index: " + model.getHeatIndex());
      view.setRelativeHumidityLabel("Relative Humidity: " + model.getRelativeHumidity());
      view.setWindChillLabel("Wind Chill: " + model.getWindChill());
    } catch (NumberFormatException e) {
      view.showErrorMessage("Please enter valid numbers for all fields.");
    } catch (IllegalArgumentException e) {
      view.showErrorMessage("Invalid input: " + e.getMessage());
    }
  }
}