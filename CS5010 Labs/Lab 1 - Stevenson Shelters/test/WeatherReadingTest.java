import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Objects;
import model.weather.StevensonReading;
import model.weather.WeatherReading;
import org.junit.Before;
import org.junit.Test;

/**
 * WeatherReadingTest class is a test class for WeatherReading Interface.
 */
public class WeatherReadingTest {
  private WeatherReading obj1;

  @Before
  public void setUp() {
    obj1 = weatherReadingObj(36, 21.9, 6.33, 24.27);
  }

  private WeatherReading weatherReadingObj(double temperature, double dewPoint, double windSpeed,
                                           double totalRain) {
    return new StevensonReading(temperature, dewPoint, windSpeed, totalRain);
  }

  @Test
  public void testGetTemperature() {
    assertEquals(36, obj1.getTemperature());
    assertNotEquals(23, obj1.getTemperature());
  }

  @Test
  public void testGetDewPoint() {
    assertEquals(22, obj1.getDewPoint());
    assertNotEquals(12, obj1.getDewPoint());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidDewPoint() throws IllegalArgumentException {
    weatherReadingObj(20, 40, 15, 10.15);
  }

  @Test
  public void testGetWindSpeed() {
    assertEquals(6, obj1.getWindSpeed());
    assertNotEquals(3, obj1.getWindSpeed());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidWindSpeed() throws IllegalArgumentException {
    weatherReadingObj(17, 11, -5.6, 19);
  }

  @Test
  public void testGetTotalRain() {
    assertEquals(24, obj1.getTotalRain());
    assertNotEquals(12, obj1.getTotalRain());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidTotalRain() throws IllegalArgumentException {
    weatherReadingObj(39, 7, 3, -0.0001);
  }

  @Test
  public void testGetRelativeHumidity() {
    assertEquals(64, obj1.getRelativeHumidity());
    assertNotEquals(50, obj1.getRelativeHumidity());
  }

  @Test
  public void testGetHeatIndex() {
    assertEquals(51, obj1.getHeatIndex());
    assertNotEquals(25, obj1.getHeatIndex());
  }

  @Test
  public void testGetWindChill() {
    WeatherReading weatherObject1 = weatherReadingObj(40.288042, 34.510570, 46.029026, 81);
    assertEquals(47, weatherObject1.getWindChill());
    assertNotEquals(117, weatherObject1.getWindChill());
  }

  @Test
  public void testToString() {
    assertEquals("Reading: T = 36, D = 22, v = 6, rain = 24", obj1.toString());
    assertNotEquals("Reading: T = 33, D = 20, v = 5, rain = 30", obj1.toString());
  }

  @Test
  public void testEquals() {
    WeatherReading weatherObject1 = weatherReadingObj(36, 21.9, 6.33, 24.27);
    WeatherReading weatherObject2 = weatherReadingObj(36, 21.9, 6.33, 24.27);
    final WeatherReading differentWeatherObject = weatherReadingObj(33, 24, 8.39, 69.96);
    //test if obj1 equals itself
    assertEquals(obj1, obj1);
    //test if obj1 equals weatherObject1 with same value
    assertEquals(obj1, weatherObject1);
    //test if weatherObject1 equals weatherObject2 with same value
    assertEquals(weatherObject1, weatherObject2);
    //test if obj1 equals weatherObject2 with same value
    assertEquals(obj1, weatherObject2);
    //test if obj1 doesn't equal differentWeatherObject
    assertNotEquals(obj1, differentWeatherObject);
    //test if obj1 doesn't equal a new object
    assertNotEquals(obj1, new Object());
  }

  @Test
  public void testHashCode() {
    assertEquals(Objects.hash(22.9 + 5.8 + 19.82 + 13.29),
        (weatherReadingObj(22.9, 5.8, 19.82, 13.29).hashCode()));
    assertNotEquals(weatherReadingObj(42.9, 15.8, 9.82, 3.29), weatherReadingObj(23, 6, 20, 13));
  }
}