package view;

import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This class represents the view for the Book model.
 * @author Hao Jin
 */
public class BookView {
  private JLabel titleLabel = new JLabel("Title:");
  private JTextField titleTextField = new JTextField(10);
  private JLabel priceLabel = new JLabel("Price:");
  private JTextField priceTextField = new JTextField(10);
  private JButton updateButton = new JButton("Update");
  private JLabel updatedInfoLabel = new JLabel("");
  private JPanel mainPanel = new JPanel();

  public BookView() {
    mainPanel.add(titleLabel);
    mainPanel.add(titleTextField);
    mainPanel.add(priceLabel);
    mainPanel.add(priceTextField);
    mainPanel.add(updateButton);
    mainPanel.add(updatedInfoLabel);
  }

  public String getTitle() {
    return titleTextField.getText();
  }

  public float getPrice() {
    return Float.parseFloat(priceTextField.getText());
  }

  public void setTitle(String title) {
    titleTextField.setText(title);
  }

  public void setPrice(float price) {
    priceTextField.setText(Float.toString(price));
  }

  public void addUpdateButtonListener(ActionListener listenForUpdateButton) {
    updateButton.addActionListener(listenForUpdateButton);
  }

  public void displayErrorMessage(String errorMessage) {
    JOptionPane.showMessageDialog(null, errorMessage);
  }

  public JPanel getMainPanel() {
    return mainPanel;
  }

  public JLabel getUpdatedInfoLabel() {
    return updatedInfoLabel;
  }
}