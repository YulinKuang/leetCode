import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution917Test {

    @Test
    void sortArrayByParityII() {
        Solution917 solution = new Solution917();
        int[] A = new int[]{2,3,1,1,4,0,0,4,3,3};
        int[] ans = solution.sortArrayByParityII(A);
        int[] expected = new int[]{2,3,4,1,0,1,0,3,4,3};
        assertArrayEquals(expected, ans);
    }
}