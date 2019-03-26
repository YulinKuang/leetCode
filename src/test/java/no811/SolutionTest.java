package no811;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void subdomainVisits() {
        Solution solution = new Solution();
        String[] input = new String[]{"900 google.mail.com",
                "50 yahoo.com",
                "1 intel.mail.com",
                "5 wiki.org"};
        LinkedList<String> expected = new LinkedList<String>(){{
            add("901 mail.com");
            add("50 yahoo.com");
            add("900 google.mail.com");
            add("5 wiki.org");
            add("5 org");
            add("1 intel.mail.com");
            add("951 com");}};
        assertLinesMatch(expected, (LinkedList<String>)solution.subdomainVisits(input));
    }
}