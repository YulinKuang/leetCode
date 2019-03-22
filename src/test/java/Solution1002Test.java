import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class Solution1002Test {

    @Test
    public void commonChars() {
        Solution1002 solution = new Solution1002();
        String[] A = new String[]{"bella","label","roller"};
        String[] expected = new String[]{"e","l","l"};
        LinkedList<String> actual = (LinkedList<String>) solution.commonChars(A);
        assertArrayEquals(expected,actual.toArray());
    }
}