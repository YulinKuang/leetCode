package no811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s: cpdomains) {
            String[] sSp = s.split(" ");
            int times = Integer.parseInt(sSp[0]);
            String domain = sSp[1];
            updateMap(domain, times, map);
            String newDomain = dotSplit(domain);
            while (!newDomain.equals(domain)) {
                updateMap(newDomain, times, map);
                domain = newDomain;
                newDomain = dotSplit(domain);
            }
        }
        LinkedList<String> list = new LinkedList<>();
        for (String key: map.keySet()
             ) {
            list.add(map.get(key)+ " " + key);
        }
        return list;
    }

    private void updateMap(String domain, int times, HashMap<String, Integer> map) {
        if (!map.keySet().contains(domain)) {
            map.put(domain, times);
        }
        else {
            map.replace(domain, map.get(domain) + times);
        }
    }

    private String dotSplit(String s) {
        int firstDotIndex = findFirstDot(s);
        return s.substring(firstDotIndex+1);
    }

    private int findFirstDot(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') return i;
        }
        return -1;
    }
}
