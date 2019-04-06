package no1002;

import no1002.Solution;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void commonChars() {
        Solution solution = new Solution();
        String[] input = new String[]{"bella","label","roller"};
        LinkedList<String> output = (LinkedList<String>) solution.commonChars(input);
        LinkedList<String> expected = new LinkedList<String>(){{add("l");add("l");add("e");}};
        assertLinesMatch(expected, output);
    }
}