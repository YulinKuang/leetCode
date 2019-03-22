package no1002;

import java.util.*;

import static java.lang.Integer.min;

public class Solution {
    public List<String> commonChars(String[] A) {
        HashMap<Character, Integer>[] charsCount = new HashMap[A.length];
        for (int i = 0; i < A.length; i++) {
            charsCount[i] = new HashMap<>();
            int len = A[i].length();
            for (int j = 0; j < len; j++) {
                char ch = A[i].charAt(j);
                if (charsCount[i].containsKey(ch)) {
                    charsCount[i].replace(ch, charsCount[i].get(ch) + 1);
                }
                else
                    charsCount[i].put(ch, 1);
            }
        }
        HashMap<Character, Integer> result = (HashMap<Character, Integer>) charsCount[0].clone();
        for (int i = 1; i < A.length; i++) {
            Iterator<Map.Entry<Character, Integer>> it = result.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Character, Integer> item = it.next();
                char ch = item.getKey();
                int num = item.getValue();
                if (charsCount[i].containsKey(ch))
                    result.replace(ch, min(num, charsCount[i].get(ch)));
                else
                    it.remove();
            }
        }
        LinkedList<String> finalResult = new LinkedList<>();
        for (char ch : result.keySet()) {
            int num = result.get(ch);
            for (int i = 0; i < num; i ++)
                finalResult.add(ch+"");
        }
        return finalResult;
    }
}
