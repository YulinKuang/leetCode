package no561;

import no561.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void arrayPairSum() {
        Solution solution = new Solution();
        int[] nums = new int[]{1,4,3,2};
        assertEquals(4, solution.arrayPairSum(nums));
    }
}