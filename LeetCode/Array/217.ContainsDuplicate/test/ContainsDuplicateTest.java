import model.ContainsDuplicateModelImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for ContainsDuplicateModel.
 *
 * @author Hao Jin
 */
public class ContainsDuplicateTest {
  @Test
  public void testContainsDuplicate() {
    ContainsDuplicateModelImpl model = new ContainsDuplicateModelImpl();
    assertTrue(model.containsDuplicate(new int[]{1, 2, 3, 4, 5, 1}));
    assertFalse(model.containsDuplicate(new int[]{1, 2, 3, 4, 5}));
  }
}
