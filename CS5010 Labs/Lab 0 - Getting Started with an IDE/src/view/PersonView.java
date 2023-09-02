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
 * This class represents the view for the Person model.
 * @author Hao Jin
 */
public class PersonView {
  private JLabel firstNameLabel = new JLabel("First Name:");
  private JTextField firstNameTextField = new JTextField(10);
  private JLabel lastNameLabel = new JLabel("Last Name:");
  private JTextField lastNameTextField = new JTextField(10);
  private JLabel yearOfBirthLabel = new JLabel("Year of Birth:");
  private JTextField yearOfBirthTextField = new JTextField(10);
  private JButton updateButton = new JButton("Update");
  private JLabel updatedInfoLabel = new JLabel("");
  private JPanel mainPanel = new JPanel();

  public PersonView() {
    mainPanel.add(firstNameLabel);
    mainPanel.add(firstNameTextField);
    mainPanel.add(lastNameLabel);
    mainPanel.add(lastNameTextField);
    mainPanel.add(yearOfBirthLabel);
    mainPanel.add(yearOfBirthTextField);
    mainPanel.add(updateButton);
    mainPanel.add(updatedInfoLabel);
  }

  public String getFirstName() {
    return firstNameTextField.getText();
  }

  public String getLastName() {
    return lastNameTextField.getText();
  }

  public int getYearOfBirth() {
    return Integer.parseInt(yearOfBirthTextField.getText());
  }

  public void setFirstName(String firstName) {
    firstNameTextField.setText(firstName);
  }

  public void setLastName(String lastName) {
    lastNameTextField.setText(lastName);
  }

  public void setYearOfBirth(int yearOfBirth) {
    yearOfBirthTextField.setText(Integer.toString(yearOfBirth));
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