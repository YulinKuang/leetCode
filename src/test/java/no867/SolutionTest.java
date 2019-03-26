package no867;

import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void transpose() {
        Solution solution = new Solution();
        int[][] input = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] expected = new int[][]{{1,4,7},{2,5,8},{3,6,9}};
        assertArrayEquals(expected, solution.transpose(input));
    }
}