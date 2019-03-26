package no908;

class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min = A[0];
        int max = A[0];
        for (int a : A) {
            if (a < min) min = a;
            else if (a > max) max = a;
        }
        return Math.max(max - min - 2 *K, 0);
    }
}