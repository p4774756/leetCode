package org.example;

import java.util.*;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("pwwkew"));
    }
    static public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        HashSet<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right=0; right<s.length(); right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while(charSet.contains(s.charAt(right)))
                {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        return  maxLength;
    }

    static public int lengthOfLongestSubstring2(String s) {
        int maxLength = 0;

        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int right=0; right<s.length(); right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }

        return  maxLength;
    }
}
