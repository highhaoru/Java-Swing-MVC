package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This class represents the view for the Person model.
 *
 * @author Hao Jin
 */
public class PersonViewImpl implements PersonView{
  private final JLabel firstNameLabel = new JLabel("First Name:");
  private final JTextField firstNameTextField = new JTextField(10);
  private final JLabel lastNameLabel = new JLabel("Last Name:");
  private final  JTextField lastNameTextField = new JTextField(10);
  private final  JLabel yearOfBirthLabel = new JLabel("Year of Birth:");
  private final  JTextField yearOfBirthTextField = new JTextField(10);
  private final  JButton updateButton = new JButton("Update");
  private final  JLabel updatedInfoLabel = new JLabel("");
  private final  JPanel mainPanel = new JPanel();

  public PersonViewImpl() {
    mainPanel.add(firstNameLabel);
    mainPanel.add(firstNameTextField);
    mainPanel.add(lastNameLabel);
    mainPanel.add(lastNameTextField);
    mainPanel.add(yearOfBirthLabel);
    mainPanel.add(yearOfBirthTextField);
    mainPanel.add(updateButton);
    mainPanel.add(updatedInfoLabel);
  }

  @Override
  public String getFirstName() {
    return firstNameTextField.getText();
  }

  @Override
  public void setFirstName(String firstName) {
    firstNameTextField.setText(firstName);
  }

  @Override
  public String getLastName() {
    return lastNameTextField.getText();
  }

  @Override
  public void setLastName(String lastName) {
    lastNameTextField.setText(lastName);
  }

  @Override
  public int getYearOfBirth() {
    return Integer.parseInt(yearOfBirthTextField.getText());
  }

  @Override
  public void setYearOfBirth(int yearOfBirth) {
    yearOfBirthTextField.setText(Integer.toString(yearOfBirth));
  }

  @Override
  public void addUpdateButtonListener(ActionListener listenForUpdateButton) {
    updateButton.addActionListener(listenForUpdateButton);
  }

  @Override
  public void displayErrorMessage(String errorMessage) {
    JOptionPane.showMessageDialog(null, errorMessage);
  }

  @Override
  public JPanel getMainPanel() {
    return mainPanel;
  }

  @Override
  public JLabel getUpdatedInfoLabel() {
    return updatedInfoLabel;
  }
}