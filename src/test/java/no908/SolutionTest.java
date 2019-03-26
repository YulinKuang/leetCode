package no908;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void smallestRangeI() {
        Solution solution = new Solution();
        assertEquals(0, solution.smallestRangeI(new int[]{1,3,6}, 3));
        assertEquals(3, solution.smallestRangeI(new int[]{2,7,2}, 1));
        assertEquals(8, solution.smallestRangeI(new int[]{9,10,0,7}, 1));
        assertEquals(1, solution.smallestRangeI(new int[]{3,1,10}, 4));
    }
}