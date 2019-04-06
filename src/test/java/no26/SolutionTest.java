package no26;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void removeDuplicates() {
        Solution solution = new Solution();
        int[] nums = new int[]{1,1,2};
        assertEquals(2, solution.removeDuplicates(nums));
    }
}