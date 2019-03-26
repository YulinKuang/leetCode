package no806;

class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int len = S.length();
        int last = 0;
        int lines = 0;
        for (int i = 0; i < len; i++) {
            char ch = S.charAt(i);
            int width = widths[ch - 'a'];
            if (last + width > 100) {
                lines++;
                last = width;
            }
            else {
                last += width;
            }
        }
        if (last > 0) lines++;
        return new int[]{lines, last};
    }
}