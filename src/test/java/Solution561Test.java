import org.junit.Test;

import static org.junit.Assert.*;

public class Solution561Test {

    @Test
    public void arrayPairSum() {
        Solution561 solution = new Solution561();
        int[] nums = new int[]{1,4,3,2};
        assertEquals(4, solution.arrayPairSum(nums));
    }
}