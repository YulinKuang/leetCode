import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class Solution1002Test {

    @Test
    void commonChars() {
        Solution1002 solution = new Solution1002();
        String[] input = new String[]{"bella","label","roller"};
        LinkedList<String> output = (LinkedList<String>) solution.commonChars(input);
        LinkedList<String> expected = new LinkedList<String>(){{add("l");add("l");add("e");}};
        assertLinesMatch(expected, output);
    }
}