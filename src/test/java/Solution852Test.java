import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution852Test {

    @Test
    public void peakIndexInMountainArray() {
        Solution852 solution = new Solution852();
        int[] a1 = new int[]{0,2,1,0}, a2 = new int[]{0,1,0};
        assertEquals(1, solution.peakIndexInMountainArray(a1));
        assertEquals(1, solution.peakIndexInMountainArray(a2));

    }
}