package no867;

public class Solution {
    public int[][] transpose(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] At = new int[n][m];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                At[j][i] = A[i][j];
        return At;
    }
}
