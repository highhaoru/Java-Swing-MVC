import model.TwoSumModel;
import model.TwoSumModelImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumModelTest {

  @Test
  public void testFindIndices() {
    TwoSumModel model = new TwoSumModelImpl();

    // 测试用例1
    int[] nums1 = {2, 7, 11, 15};
    int target1 = 9;
    int[] expected1 = {0, 1};
    Assertions.assertArrayEquals(expected1, model.twoSum(nums1, target1));

    // 测试用例2
    int[] nums2 = {3, 2, 4};
    int target2 = 6;
    int[] expected2 = {1, 2};
    Assertions.assertArrayEquals(expected2, model.twoSum(nums2, target2));

    // 测试用例3（无解的情况）
    int[] nums3 = {1, 2, 3};
    int target3 = 7;
    int[] expected3 = {};
    Assertions.assertArrayEquals(expected3, model.twoSum(nums3, target3));
  }
}
