package view;

import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This interface represents the view for the Person model.
 *
 * @author Hao Jin
 */
public interface PersonView {

  /**
   * Gets the first name from the view's text field.
   *
   * @return the first name of the person as a String
   */
  String getFirstName();

  /**
   * Sets the first name in the view's text field.
   *
   * @param firstName the new first name of the person
   */
  void setFirstName(String firstName);

  /**
   * Gets the last name from the view's text field.
   *
   * @return the last name of the person as a String
   */
  String getLastName();

  /**
   * Sets the last name in the view's text field.
   *
   * @param lastName the new last name of the person
   */
  void setLastName(String lastName);

  /**
   * Gets the year of birth from the view's text field.
   *
   * @return the year of birth of the person as an int
   */
  int getYearOfBirth();

  /**
   * Sets the year of birth in the view's text field.
   *
   * @param yearOfBirth the new year of birth of the person
   */
  void setYearOfBirth(int yearOfBirth);

  /**
   * Adds an ActionListener for the update button in the view.
   *
   * @param listenForUpdateButton the ActionListener for the update button
   */
  void addUpdateButtonListener(ActionListener listenForUpdateButton);

  /**
   * Displays an error message using a JOptionPane.
   *
   * @param errorMessage the error message to display
   */
  void displayErrorMessage(String errorMessage);

  /**
   * Gets the main JPanel containing all UI components.
   *
   * @return the main JPanel
   */
  JPanel getMainPanel();

  /**
   * Gets the JLabel used for displaying updated information.
   *
   * @return the JLabel for updated information
   */
  JLabel getUpdatedInfoLabel();
}