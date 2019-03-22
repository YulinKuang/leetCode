import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution728Test {

    @Test
    public void selfDividingNumbers() {
        int left = 1, right = 22;
        Solution728 solution = new Solution728();
        String actual = solution.selfDividingNumbers(left, right).toString();
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]";
        assertEquals(expected, actual);
    }
}