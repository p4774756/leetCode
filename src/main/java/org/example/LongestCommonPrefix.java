package org.example;

public class LongestCommonPrefix {
    public static void main(String[] args) {

    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        int minLength = 200;

        // found out the min length
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }

        for (int i=0; i<minLength; i++) {
            char c = strs[0].charAt(i);
            for (String str: strs) {
                if (str.charAt(i) != c) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
