package 리틀코드.wrongpattern;

import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character, String> charMap = new HashMap<>();
        Map<String, Character> strMap = new HashMap<>();
        String[] words = str.split(" ");

        if (pattern.length() != words.length) return false;

        for (int i=0; i<words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charMap.containsKey(c) && !charMap.get(c).equals(word)) {
                return false;
            }

            if (strMap.containsKey(word) && strMap.get(word) != c) {
                return false;
            }

            charMap.put(c, word);
            strMap.put(word, c);
        }

        return true;
    }
}
