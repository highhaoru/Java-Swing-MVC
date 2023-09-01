package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Model class for checking if an array contains duplicate elements.
 *
 * @author Hao Jin
 * @version 1.0
 */
public class ContainsDuplicateModelImpl implements ContainsDuplicateModel {
  /**
   * Checks if the given array contains any duplicate elements.
   *
   * <p>This method uses a HashSet to keep track of unique elements
   * encountered in the array. It iterates through the array and checks
   * for each element if it already exists in the HashSet.
   *
   * @param nums The array of integers to check for duplicates.
   * @return true if the array contains duplicates, otherwise false.
   */
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> uniques = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (uniques.contains(nums[i])) {
        return true;
      }
      uniques.add(nums[i]);
    }
    return false;
  }
}
