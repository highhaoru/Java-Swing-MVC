package view;

import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This interface represents the view for the Book model.
 *
 * @author Hao Jin
 */
public interface BookView {

  /**
   * Gets the title from the view's text field.
   *
   * @return the title of the book as a String
   */
  String getTitle();

  /**
   * Sets the title in the view's text field.
   *
   * @param title the new title of the book
   */
  void setTitle(String title);

  /**
   * Gets the price from the view's text field.
   *
   * @return the price of the book as a float
   */
  float getPrice();

  /**
   * Sets the price in the view's text field.
   *
   * @param price the new price of the book
   */
  void setPrice(float price);

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

