package model;

/**
 * The TwoSumModel interface defines the contract for solving the "Two Sum" problem.
 * The goal is to identify two indices of the input array such that the elements at those
 * indices sum up to the specified target.
 */
public interface TwoSumModel {
  /**
   * Finds two indices in the given array such that the elements at those indices
   *        sum up to the target.
   *
   * @param nums   The input array of integers. Cannot be null.
   * @param target The target sum to achieve.
   * @return An array containing the two indices whose elements sum to the target.
   *        Returns an empty array if no such indices are found.
   */
  int[] twoSum(int[] nums, int target);
}
