package controller;

import model.weather.WeatherReading;
import view.WeatherView;

/**
 * The WeatherController interface defines methods for initializing the view
 * and updating the model based on user actions. Classes that implement this
 * interface will handle the logic for interaction between the model and the view.
 *
 * @author Hao Jin
 * @date 2023-09-05
 */
public interface WeatherController {

  /**
   * Initializes the view by setting it up and displaying it to the user.
   */
  void initView();

  /**
   * Updates the WeatherReading model based on user actions.
   *
   * @param newReading The new WeatherReading object to update the model with.
   */
  void updateModel(WeatherReading newReading);

  /**
   * Sets the WeatherView for this controller.
   *
   * @param view The WeatherView to be controlled.
   */
  void setView(WeatherView view);
}