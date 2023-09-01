package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * View class for displaying the ContainsDuplicate GUI.
 *
 * @author Hao Jin
 */
public class ContainsDuplicateViewImpl implements ContainsDuplicateView {
  public JFrame frame;
  public JButton checkButton;
  public JTextField inputField;
  public JLabel resultLabel;
  public JLabel instructionLabel; // 新增一行

  /**
   * Constructs a new instance of ContainsDuplicateViewImpl and initializes the GUI components.
   *
   * <p>This constructor sets up the JFrame, including size and layout, and initializes all the
   * GUI components such as JLabels, JTextField, and JButton. It also sets their sizes and
   * positions within the JFrame.
   */
  public ContainsDuplicateViewImpl() {
    frame = new JFrame("Contains Duplicate Checker");
    frame.setSize(400, 200);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    instructionLabel = new JLabel("Enter numbers separated by commas:"); // 新增一行
    instructionLabel.setBounds(50, 0, 300, 20); // 新增一行

    inputField = new JTextField();
    inputField.setBounds(50, 20, 300, 20);

    checkButton = new JButton("Check");
    checkButton.setBounds(150, 50, 100, 30);

    resultLabel = new JLabel("Result:");
    resultLabel.setBounds(50, 100, 300, 20);

    frame.add(instructionLabel); // 新增一行
    frame.add(inputField);
    frame.add(checkButton);
    frame.add(resultLabel);
  }
}