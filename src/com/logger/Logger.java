package com.logger;

public class Logger {
    public static void info(String s) {
        System.out.println(s);
    }
    public static void logLine() {
        System.out.println(new String(new char[100]).replace('\0', '-'));
    }

    public static void logArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }
}
