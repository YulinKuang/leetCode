package no917;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortArrayByParityII() {
        Solution solution = new Solution();
        int[] A = new int[]{2,3,1,1,4,0,0,4,3,3};
        int[] ans = solution.sortArrayByParityII(A);
        int[] expected = new int[]{2,3,4,1,0,1,0,3,4,3};
        assertArrayEquals(expected, ans);
    }
}