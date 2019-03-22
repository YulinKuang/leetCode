import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution933Test {

    @Test
    public void ping() {
        Solution933 solution933 = new Solution933();
        int[] T = new int[]{1,100,3001,3002};
        int[] expected = new int[]{1,2,3,3};
        int[] result = new int[expected.length];
        for (int i = 0; i < T.length; i++) {
            result[i] = solution933.ping(T[i]);
        }
        assertArrayEquals(expected, result);
    }
}