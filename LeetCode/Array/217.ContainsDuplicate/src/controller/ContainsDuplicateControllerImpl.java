package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ContainsDuplicateModelImpl;
import view.ContainsDuplicateViewImpl;

/**
 * Controller class for managing the ContainsDuplicate application.
 *
 * @author Hao Jin
 */
public class ContainsDuplicateControllerImpl implements ContainsDuplicateController {
  private final ContainsDuplicateModelImpl model;
  private final ContainsDuplicateViewImpl view;

  /**
   * Constructs a new instance of the ContainsDuplicateControllerImpl.
   * Initializes the model and view, and adds an action listener to
   * the "Check" button to invoke the checkContainsDuplicate method.
   *
   * @param model The ContainsDuplicateModelImpl instance that contains the business logic.
   * @param view  The ContainsDuplicateViewImpl instance that handles the user interface.
   */
  public ContainsDuplicateControllerImpl(ContainsDuplicateModelImpl model,
                                         ContainsDuplicateViewImpl view) {
    this.model = model;
    this.view = view;

    this.view.checkButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        checkContainsDuplicate();
      }
    });
  }

  @Override
  public void initializeView() {
    view.frame.setVisible(true);
  }

  private void checkContainsDuplicate() {
    String input = view.inputField.getText();
    String[] numbers = input.split(",");
    int[] nums = new int[numbers.length];

    try {
      for (int i = 0; i < numbers.length; i++) {
        nums[i] = Integer.parseInt(numbers[i].trim());
      }
    } catch (NumberFormatException e) {
      view.resultLabel.setText("Result: Invalid input. Please enter numbers.");
      return;
    }

    boolean result = model.containsDuplicate(nums);
    view.resultLabel.setText("Result: " + (result ? "Contains Duplicate" : "No Duplicates"));
  }
}