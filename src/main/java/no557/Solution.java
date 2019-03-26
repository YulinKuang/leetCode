package no557;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuffer result = new StringBuffer();
        for (String word:words)
            result.append(new StringBuffer(word).reverse().toString()).append(" ");
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
