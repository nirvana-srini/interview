package com.educative.twopointer;

import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        int[][] inputs = {
                {0, 0, 1, 2, 2, 1, 2, 2}
        };
        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tcolors: " + Arrays.toString(inputs[i]));

            int[] sortedColors = sortColors(inputs[i].clone());
            System.out.println("\n\tThe sorted array is: " + Arrays.toString(sortedColors));

        }
        System.out.println(Arrays.toString(sortColors(new int[]{1, 2, 0, 2,0, 1, 2})));
    }
    public static int[] sortColors (int[] colors) {

        // Replace this placeholder return statement with your code

        int white = 0;
        int red = 0;
        int blue = colors.length-1;

        while (white <= blue) {
            if (colors[white] == 0) {
                int temp = colors[red];
                colors[red] = colors[white];
                colors[white] = temp;
                 white ++;
                 red ++;
            } else if (colors[white] == 1) {
                white ++;
            } else {
                int temp = colors[blue];
                colors[blue] = colors[white];
                colors[white] = temp;
                blue --;
            }
        }

        return colors;
    }
}
