# Java Swing MVC: Weather Data Application

## Author

Hao Jin

## Introduction
![User Interface](res/User%20Interface.png)
![Input Data](res/User%20Interface2.png)

This is a weather data application built using Java Swing and the MVC (Model-View-Controller) pattern.

## Date

2023-09-05

## File Structure

- `StevensonController.java`: The controller implementation that handles the interaction between the model and the view.
- `WeatherController.java`: Interface for the controller.
- `StevensonReading.java`: Implementation of the StevensonReading model.
- `WeatherReading.java`: Interface for the weather model.
- `StevensonView.java`: Implementation of the view.
- `WeatherView.java`: Interface for the view.
- `Main.java`: Entry point for the application.
- `WeatherReadingTest.java`: Unit tests.

## Usage

1. Clone the repository to your local machine.
2. Open the project and run `Main.java`.
3. Enter weather data (Temperature, Dew Point, Wind Speed, and Total Rain) into the interface.
4. Click the "Get Weather Data" button to fetch and display derived weather data like Heat Index, Relative Humidity, and Wind Chill.
5. Click the "Reset" button to reset all the fields and labels.

## Features

- Fetch and display derived weather data.
- Data validation.
- Error handling.

## To-Do

- [ ] Support for more types of weather readings.
- [ ] Add data persistence.
- [ ] Optimize the user interface.

## Unit Tests

Run `WeatherReadingTest.java` to execute the unit tests.

## Contributions

Pull Requests and Issues are welcome.
