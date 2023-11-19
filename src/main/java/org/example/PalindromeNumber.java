package org.example;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);

        // 負數
        if (x < 0) {
            return false;
        }
        // 個位數
        if (x / 10 == 0) {
            return true;
        }
        // 雙位數
        if (a.length() / 2 == 0) {
            return false;
        }

        for (int i=0; i<(a.length()/2);i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
