package org.example;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String pattern = "babad";
        System.out.println(new LongestPalindromicSubstring().longestPalindrome(pattern));
    }

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String maxPalindromeString = s.substring(0,1);

        for (int i=0; i<s.length(); i++) {
            String odd = findMaxPalindromicLength(s, i, i);
            String even = findMaxPalindromicLength(s, i, i+1);
            if (odd.length() > maxPalindromeString.length()) {
                maxPalindromeString = odd;
            }
            if (even.length() > maxPalindromeString.length()) {
                maxPalindromeString = even;
            }
        }

        return maxPalindromeString;
    }

    public String findMaxPalindromicLength(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left+1, right);
    }
}
