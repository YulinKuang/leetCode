package no821;

class Solution {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
        {
            if (S.charAt(i) == C) result[i] = 0;
            else {
                int left = 1;
                int right = 1;
                while ( (i - left >= 0) || ( i + right < n) ) {
                    if (i - left >= 0) {
                        if (S.charAt(i - left) == C) {
                            result[i] = left;
                            break;
                        }
                        else
                            left++;
                    }
                    if (i + right < n) {
                        if (S.charAt(i + right) == C) {
                            result[i] = right;
                            break;
                        }
                        else
                            right++;
                    }
                }
            }
        }
        return result;
    }
}
