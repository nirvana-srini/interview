package com.educative.twopointer;

import com.logger.Logger;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String[] testCase = {
                "RACEACAR",
                "A",
                "ABCDEFGFEDCBA",
                "ABC",
                "ABCBA",
                "ABBA",
                "RACEACAR"
        };
        for (String input : testCase) {
            Logger.logLine();
            boolean valid = palindrome(input);
            String printMessage = String.format("Given String \"%s\" is not a Palindrome", input);
            if (valid) {
                printMessage = String.format("Given String \"%s\" is a valid Palindrome", input);
            }
            Logger.info(printMessage);
            Logger.logLine();
        }
    }
    public static boolean palindrome(String input) {
        Logger.info(input);
        int left = 0;
        int right = input.length() - 1;
        int i = 1;
        while (left < right) {

            System.out.println("In iteration " + i + ", left = " + left + ", right = " + right);
            System.out.println("The current element being pointed to by the left pointer is '" + input.charAt(left) + "'");
            System.out.println("The current element being pointed to by the right pointer is '" + input.charAt(right) + "'");
            if(input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left = left + 1;
            right = right - 1;
            i = i+ 1;
        }
        System.out.println("Loop terminated with left = " + left + ", right = " + right);
        return true;
    }

}