import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeTest {

  // TODO: Implement tests for Practice.mostCommonTimeEfficient and
  // Practice.mostCommonSpaceEfficient

@Test
    public void testMostCommonNormalSpace() {
        // Simple case: 2 is the most common
        int[] nums = {1, 2, 3, 2, 4, 2, 5};
        int result = Practice.mostCommonSpaceEfficient(nums);
        assertEquals(2, result);
    }

    @Test
    public void testMostCommonWithTieSpace() {
        // Tie between 1 and 2. 1 comes first, so it should win.
        int[] nums = {1, 1, 2, 2, 3};
        int result = Practice.mostCommonSpaceEfficient(nums);
        assertEquals(1, result);
    }

    @Test
    public void testMostCommonNormalSpaceTime() {
        // Simple case: 2 is the most common
        int[] nums = {1, 2, 3, 2, 4, 2, 5};
        int result = Practice.mostCommonTimeEfficient(nums);
        assertEquals(2, result);
    }

    @Test
    public void testMostCommonWithTieSpaceTime() {
        // Tie between 1 and 2. 1 comes first, so it should win.
        int[] nums = {1, 1, 2, 2, 3};
        int result = Practice.mostCommonTimeEfficient(nums);
        assertEquals(1, result);
    }
  
  // Hints: They are static methods, so you will use the full
  // Practice.mostCommonTimeEfficient for method calls
}
