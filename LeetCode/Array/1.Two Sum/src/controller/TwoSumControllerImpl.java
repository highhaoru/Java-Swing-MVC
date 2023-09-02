package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.TwoSumModelImpl;
import view.TwoSumViewImpl;

/**
 * Provides the concrete implementation of the {@link TwoSumController} interface, coordinating
 * the {@link TwoSumModelImpl} and {@link TwoSumViewImpl} components in the MVC architecture.
 * <p>
 * This implementation makes use of Java Swing to interact with the user and uses an
 * ActionListener to respond to button clicks in the view.
 * </p>
 *
 * @see TwoSumModelImpl
 * @see TwoSumViewImpl
 */
public class TwoSumControllerImpl implements TwoSumController {
  private final TwoSumModelImpl model;
  private final TwoSumViewImpl view;

  /**
   * Constructs a TwoSumControllerImpl object and initializes it with the provided model and view
   * components. Also sets up an ActionListener for the "Find Indices" button in the view.
   *
   * @param model The model implementation for solving the Two Sum problem.
   * @param view  The view implementation for user interaction.
   */
  public TwoSumControllerImpl(TwoSumModelImpl model, TwoSumViewImpl view) {
    this.model = model;
    this.view = view;
    this.view.addFindButtonListener(new FindButtonListener());
  }

  /**
   * Makes the view visible to the user. This method should be called to start the user
   * interaction.
   */
  @Override
  public void run() {
    view.setVisible(true);
  }

  /**
   * Internal ActionListener class that listens for the "Find Indices" button click in the view.
   * <p>
   * When the button is clicked, this listener fetches the input array and target sum from the
   * view, uses the model to find the two indices that sum to the target, and then updates the
   * view with the result.
   * </p>
   */
  class FindButtonListener implements ActionListener {
    /**
     * Called when the "Find Indices" button is clicked.
     * <p>
     * Fetches the user inputs, performs the calculation using the model, and updates the view.
     * </p>
     *
     * @param e The event object containing details about the action event.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
      int[] nums = view.getNums();
      int target = view.getTarget();
      int[] result = model.twoSum(nums, target);
      view.showResult(result);
    }
  }
}
