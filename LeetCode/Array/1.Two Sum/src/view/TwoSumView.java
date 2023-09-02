package view;

/**
 * Defines the contract for the view component in the Model-View-Controller (MVC) architecture
 * for the "Two Sum" problem.
 * <p>
 * The view component is responsible for collecting user inputs
 *        and displaying the results.
 * It provides methods to get the input array and target sum from the user,
 *      and to show the calculated result.
 * </p>
 */
public interface TwoSumView {
  /**
   * Retrieves the user-provided array of integers.
   * <p>
   * This method should handle the user interaction necessary to collect the input array.
   * The format and method of collection are implementation-specific.
   * </p>
   *
   * @return An array of integers provided by the user.
   */
  int[] getNums();

  /**
   * Retrieves the user-provided target sum.
   * <p>
   * This method should handle the user interaction necessary to collect the target sum.
   * The format and method of collection are implementation-specific.
   * </p>
   *
   * @return The target sum provided by the user.
   */
  int getTarget();

  /**
   * Displays the result of the "Two Sum" calculation.
   * <p>
   * This method should update the view to reflect the calculated result, which is an array
   * of two indices that sum to the target, or an empty array if no such indices exist.
   * </p>
   *
   * @param result An array containing the two indices whose elements sum to the target,
   *               or an empty array if no solution is found.
   */
  void showResult(int[] result);
}
