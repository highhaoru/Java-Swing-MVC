package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.weather.WeatherReading;

public class StevensonView implements WeatherView {
  private final JFrame frame;
  private final JButton getWeatherDataButton;
  private final JButton resetButton;
  private final JTextField temperatureField;
  private final JTextField dewPointField;
  private final JTextField windSpeedField;
  private final JTextField totalRainField;
  private final JLabel heatIndexLabel;
  private final JLabel relativeHumidityLabel;
  private final JLabel windChillLabel;

  public StevensonView() {
    this.frame = new JFrame("Weather Data");
    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.frame.setLayout(new GridLayout(4, 2)); // 4 rows, 2 columns

    temperatureField = new JTextField("", 20);
    dewPointField = new JTextField("", 20);
    windSpeedField = new JTextField("", 20);
    totalRainField = new JTextField("", 20);

    getWeatherDataButton = new JButton("Get Weather Data");
    resetButton = new JButton("Reset");

    heatIndexLabel = new JLabel("Heat Index: ");
    relativeHumidityLabel = new JLabel("Relative Humidity: ");
    windChillLabel = new JLabel("Wind Chill: ");

    this.frame.add(new JLabel("Temperature: "));
    this.frame.add(temperatureField);
    this.frame.add(new JLabel("Dew Point: "));
    this.frame.add(dewPointField);
    this.frame.add(new JLabel("Wind Speed: "));
    this.frame.add(windSpeedField);
    this.frame.add(new JLabel("Total Rain: "));
    this.frame.add(totalRainField);

    this.frame.add(getWeatherDataButton);
    this.frame.add(heatIndexLabel);
    this.frame.add(relativeHumidityLabel);
    this.frame.add(windChillLabel);
    this.frame.add(resetButton);
  }

@Override
  public void setWeatherReading(WeatherReading reading) {
//    temperatureField.setText(String.valueOf(reading.getTemperature()));
//    dewPointField.setText(String.valueOf(reading.getDewPoint()));
  }

  @Override
  public void showErrorMessage(String errorMessage) {
    JOptionPane.showMessageDialog(frame, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
  }

  @Override
  public void addGetWeatherDataButtonListener(ActionListener listener) {
    getWeatherDataButton.addActionListener(listener);
  }

  @Override
  public void addResetButtonListener(ActionListener listener) {
    resetButton.addActionListener(listener);
  }

  @Override
  public String getTemperatureFieldText() {
    String[] parts = temperatureField.getText().split(": ");
    return (parts.length > 1) ? parts[1] : "0";
  }

  @Override
  public String getDewPointFieldText() {
    String[] parts = dewPointField.getText().split(": ");
    return (parts.length > 1) ? parts[1] : "0";
  }

  @Override
  public void setHeatIndexLabel(String text) {
    heatIndexLabel.setText(text);
  }

  @Override
  public void setRelativeHumidityLabel(String text) {
    relativeHumidityLabel.setText(text);
  }

  @Override
  public String getWindSpeedFieldText() {
    String[] parts = windSpeedField.getText().split(": ");
    return (parts.length > 1) ? parts[1] : "0";
  }

  @Override
  public String getTotalRainFieldText() {
    String[] parts = totalRainField.getText().split(": ");
    return (parts.length > 1) ? parts[1] : "0";
  }

  @Override
  public void setWindChillLabel(String text) {
    windChillLabel.setText(text);
  }

  @Override
  public void display() {
    frame.setSize(400, 300);
    frame.setVisible(true);
  }

  @Override
  public void resetFields() {
    temperatureField.setText("");
    dewPointField.setText("");
    windSpeedField.setText("");
    totalRainField.setText("");
    heatIndexLabel.setText("Heat Index: ");
    relativeHumidityLabel.setText("Relative Humidity: ");
    windChillLabel.setText("Wind Chill: ");
  }
}