package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This class represents the view for the Book model.
 *
 * @author Hao Jin
 */
public class BookViewImpl implements BookView {
  private final JLabel titleLabel = new JLabel("Title:");
  private final JTextField titleTextField = new JTextField(10);
  private final JLabel priceLabel = new JLabel("Price:");
  private final JTextField priceTextField = new JTextField(10);
  private final JButton updateButton = new JButton("Update");
  private final JLabel updatedInfoLabel = new JLabel("");
  private final JPanel mainPanel = new JPanel();

  /**
   * Constructs a BookViewImpl object and initializes the UI components.
   */
  public BookViewImpl() {
    mainPanel.add(titleLabel);
    mainPanel.add(titleTextField);
    mainPanel.add(priceLabel);
    mainPanel.add(priceTextField);
    mainPanel.add(updateButton);
    mainPanel.add(updatedInfoLabel);
  }

  @Override
  public String getTitle() {
    return titleTextField.getText();
  }

  @Override
  public void setTitle(String title) {
    titleTextField.setText(title);
  }

  @Override
  public float getPrice() {
    return Float.parseFloat(priceTextField.getText());
  }

  @Override
  public void setPrice(float price) {
    priceTextField.setText(Float.toString(price));
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