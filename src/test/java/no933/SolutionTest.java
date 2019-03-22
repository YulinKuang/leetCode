package no933;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void ping() {
        Solution solution = new Solution();
        int[] T = new int[]{1,100,3001,3002};
        int[] expected = new int[]{1,2,3,3};
        int[] result = new int[expected.length];
        for (int i = 0; i < T.length; i++) {
            result[i] = solution.ping(T[i]);
        }
        assertArrayEquals(expected, result);
    }
}