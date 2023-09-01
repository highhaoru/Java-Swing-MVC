package view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Provides the concrete implementation of the
 *        {@link TwoSumView} interface using Java's Swing library.
 * This class is the view component in the MVC architecture for the "Two Sum" problem.
 * <p>
 * The user interface consists of text fields for inputting the array of integers and target sum,
 * a button to initiate the calculation, and a label to display the result.
 * </p>
 *
 * @see TwoSumView
 */
public class TwoSumViewImpl extends JFrame implements TwoSumView {
  private final JTextField numsTextField;
  private final JTextField targetTextField;
  private final JButton findButton;
  private final JLabel resultLabel;

  /**
   * Constructs a TwoSumViewImpl object and initializes the Swing components.
   * Sets up the layout and default behavior of the window.
   */
  public TwoSumViewImpl() {
    setTitle("Two Sum Problem");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    numsTextField = new JTextField(20);
    targetTextField = new JTextField(10);
    findButton = new JButton("Find Indices");
    resultLabel = new JLabel("Result: ");

    add(new JLabel("Enter array (comma-separated):"));
    add(numsTextField);
    add(new JLabel("Enter target:"));
    add(targetTextField);
    add(findButton);
    add(resultLabel);

    pack();
    setLocationRelativeTo(null); // Center the frame
  }

  @Override
  public int[] getNums() {
    String numsString = numsTextField.getText();
    String[] numsSplit = numsString.split(",");
    int[] nums = new int[numsSplit.length];
    for (int i = 0; i < numsSplit.length; i++) {
      nums[i] = Integer.parseInt(numsSplit[i].trim());
    }
    return nums;
  }

  @Override
  public int getTarget() {
    return Integer.parseInt(targetTextField.getText().trim());
  }

  @Override
  public void showResult(int[] result) {
    if (result.length > 0) {
      resultLabel.setText("Result: Indices found: " + result[0] + ", " + result[1]);
    } else {
      resultLabel.setText("Result: No solution found.");
    }
  }

  /**
   * Adds an ActionListener to the "Find Indices" button.
   * <p>
   * This allows external components, such as the controller, to listen for the button click event.
   * </p>
   *
   * @param listener The ActionListener to add to the button.
   */
  public void addFindButtonListener(ActionListener listener) {
    findButton.addActionListener(listener);
  }
}
