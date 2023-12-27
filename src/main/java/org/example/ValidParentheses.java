package org.example;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String pattern = "()";
        System.out.println(new ValidParentheses().isValid(pattern));
    }


    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        boolean result = true;
        int length = s.length();

        for (int i=0; i<length; i++) {
            if (s.charAt(i) == ')' ||
            s.charAt(i) == '}' ||
            s.charAt(i) == ']') {
                if (s.charAt(i) == ')') {
                    if (st.isEmpty() || st.pop() != '(') {
                        return false;
                    }
                }
                if (s.charAt(i) == '}') {
                    if (st.isEmpty() || st.pop() != '{') {
                        return false;
                    }
                }
                if (s.charAt(i) == ']') {
                    if (st.isEmpty() || st.pop() != '[') {
                        return false;
                    }
                }
            } else {
                st.push(s.charAt(i));
            }
        }

        if (!st.isEmpty()) {
            result = false;
        }

        return result;
    }
}
