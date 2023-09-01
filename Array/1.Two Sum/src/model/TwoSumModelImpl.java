package model;

import java.util.HashMap;
import java.util.Map;

/**
 * This class implements the TwoSumModel interface, providing a concrete implementation
 * for solving the "Two Sum" problem. It utilizes a HashMap to achieve this in O(n) time complexity.
 */
public class TwoSumModelImpl implements TwoSumModel {
  @Override
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    return new int[]{};
  }
}
