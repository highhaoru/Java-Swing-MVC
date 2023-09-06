package model.weather;

import java.util.Objects;

/**
 * This class represents a reading from a Stevenson Screen, an instrument used in meteorology.
 * It holds the temperature, dew point, wind speed, and total rain measurements.
 * The class implements the WeatherReading interface.
 *
 * <p></p>
 * @ author Hao Jin
 */
public final class StevensonReading implements WeatherReading {
  private final double temperature;
  private final double dewPoint;
  private final double windSpeed;
  private final double totalRain;

  /**
   * Constructs a new StevensonReading with the given values.
   *
   * @param temperature the temperature in degrees Celsius
   * @param dewPoint    the dew point in degrees Celsius
   * @param windSpeed   the wind speed in miles per hour
   * @param totalRain   the total amount of rain in inches
   * @throws IllegalArgumentException if the dew point is greater than the temperature,
   *                                  or if either the wind speed or total rain is less than zero
   */
  public StevensonReading(double temperature, double dewPoint, double windSpeed, double totalRain)
      throws IllegalArgumentException {
    if ((dewPoint > temperature) || (windSpeed < 0) || (totalRain < 0)) {
      throw new IllegalArgumentException("Error! Values violate the natural order.");
    }

    this.temperature = temperature;
    this.dewPoint = dewPoint;
    this.windSpeed = windSpeed;
    this.totalRain = totalRain;
  }


  /**
   * Get the temperature (in Celsius) of this reading rounded to the nearest
   * integer.
   *
   * @return the temperature
   */
  @Override
  public int getTemperature() {
    return (int) Math.round(temperature);
  }

  /**
   * Get the dew point (in Celsius) for this reading rounded to the nearest
   * integer.
   *
   * @return the dew point
   */
  @Override
  public int getDewPoint() {
    return (int) Math.round(dewPoint);
  }

  /**
   * Get the wind speed (in mph) for this reading rounded to the nearest
   * integer.
   *
   * @return the wind speed
   */
  @Override
  public int getWindSpeed() {
    return (int) Math.round(windSpeed);
  }

  /**
   * Get the total rain (in mm) of this reading.
   *
   * @return the total rain
   */
  @Override
  public int getTotalRain() {
    return (int) Math.round(totalRain);
  }

  /**
   * Get the relative humidity (in percent) of this weather reading rounded to the
   * nearest integer.
   *
   * @return the relative humidity
   */
  @Override
  public int getRelativeHumidity() {
    return (int) Math.round(calculateRelativeHumidity());
  }

  /**
   * Get the heat index (in Celsius) for this weather reading rounded to the nearest integer.
   *
   * @return the heat index
   */
  @Override
  public int getHeatIndex() {
    return (int) Math.round(calculateHeatIndex());
  }

  /**
   * Get the wind chill (in Celsius) rounded to the nearest integer.
   *
   * @return the wind chill
   */
  @Override
  public int getWindChill() {
    return (int) Math.round(calculateWindChill());
  }

  //Helper Section:
  //Saturation Vapor Pressure Calculation Helper
  private double calculateSaturationVaporPressure() {
    return 6.11 * 10 * (7.5 * temperature / (237.3 + temperature));
  }

  //Actual Vapor Pressure Calculation Helper
  private double calculateActualVaporPressure() {
    return 6.11 * 10 * (7.5 * dewPoint / (237.3 + dewPoint));
  }

  //Relative Humidity Formula Helper
  private double calculateRelativeHumidity() {
    return (calculateActualVaporPressure() / calculateSaturationVaporPressure()) * 100;
  }

  //Wind Chill Calculation Helper.
  private double calculateWindChill() {
    double convertToFahrenheit = ((9.0 / 5) * temperature + 32);
    double windChill = 35.74 + (0.6215 * convertToFahrenheit)
        - (35.75 * Math.pow(windSpeed, 0.16))
        + (0.4275 * convertToFahrenheit * Math.pow(windSpeed, 0.16));
    return (windChill - 32) * (5.0 / 9); //convert back to Celsius
  }


  //Heat Index Calculation Helper.
  private double calculateHeatIndex() {
    final double c1 = -8.78469475556;
    final double c2 = 1.61139411;
    final double c3 = 2.33854883889;
    final double c4 = -0.14611605;
    final double c5 = -0.012308094;
    final double c6 = -0.0164248277778;
    final double c7 = 0.002211732;
    final double c8 = 0.00072546;
    final double c9 = -0.000003582;
    final double t = temperature;
    final double r = this.calculateRelativeHumidity();
    final double tSquared = Math.pow(temperature, 2);
    final double rSquared = Math.pow(this.calculateRelativeHumidity(), 2);
    return (c1 + (c2 * t) + (c3 * r) + (c4 * t * r) + (c5 * tSquared) + (c6 * rSquared)
        + (c7 * tSquared * r) + (c8 * t * rSquared) + (c9 * tSquared * rSquared));
  }

  @Override
  public String toString() {
    return String.format("Reading: T = %d, D = %d, v = %d, rain = %d", this.getTemperature(),
        this.getDewPoint(), this.getWindSpeed(), this.getTotalRain());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof WeatherReading)) {
      return false;
    }
    WeatherReading theOther = (WeatherReading) obj;
    return this.getTemperature() == theOther.getTemperature()
        && this.getTotalRain() == theOther.getTotalRain()
        && this.getWindSpeed() == theOther.getWindSpeed()
        && this.getDewPoint() == theOther.getDewPoint();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.temperature + this.dewPoint + this.windSpeed + this.totalRain);
  }
}