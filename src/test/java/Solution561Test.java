import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution561Test {

    @Test
    public void arrayPairSum() {
        Solution561 solution = new Solution561();
        int[] nums = new int[]{1,4,3,2};
        assertEquals(4, solution.arrayPairSum(nums));
    }
}