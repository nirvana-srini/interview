package com.educative.stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{}[]{}[{}])"));
    }
    public static boolean isValid(String s) {
        Stack<Character> charsStack = new Stack<>();
        // Replace this placeholder return statement with your code
        for (int i =0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                charsStack.push(s.charAt(i));
            } else {
                if(charsStack.isEmpty()) {
                    return false;
                }
                char top = charsStack.peek();
                if (s.charAt(i) == '}' && top == '{') {
                    charsStack.pop();
                } else if (s.charAt(i) == ']' && top == '[') {
                    charsStack.pop();
                } else if (s.charAt(i) == ')' && top == '(') {
                    charsStack.pop();
                }
                // if top is not empty
            }
        }
        return charsStack.empty();
    }
}
