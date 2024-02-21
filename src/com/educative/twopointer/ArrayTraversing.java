package com.educative.twopointer;

import java.util.List;

public class ArrayTraversing {
    public static void main(String[] args) {
        // Declare and Array
        int intVariable = 10;
        String stringVar = "Hello";
        int[] rollNumbers = {1, 2, 3, 4, 4};
        int [] integerArray = {1, 2, 3, 4};
        String[] stringArray = {"Maruthi", "Tata", "Skoda"};

        for (int i = integerArray.length -1; i >= 0; i--) {
            System.out.print(integerArray[i]);
        }
        System.out.println("\n=============");

        for (int i = stringArray.length -1; i >= 0; i--) {
            System.out.print(stringArray[i]);
        }
        System.out.println("\n=============");
    }
}
