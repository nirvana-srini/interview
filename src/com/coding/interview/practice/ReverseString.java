package com.coding.interview.practice;

import java.util.Stack;

public class ReverseString {
    static Stack<Character> temp = new Stack<>();

    public static void main(String[] args) {
        String s = "Hello world!";
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            temp.push(c);
        }

        String reversed = "";
        for (char c : charArray) {
            reversed += temp.pop();
        }

        System.out.println(reversed);
    }
}
