package com.educative.twopointer;

import com.logger.Logger;

import java.util.Arrays;

public class SumOfThree {
    public static void main(String[] args) {
        int[] nums = {8, 2, 4, 9, 5};

        System.out.println(SumOfThree.findSumOfThree(nums, 17));
    }
    public static boolean findSumOfThree(int[] nums, int target) {
        Arrays.sort(nums);
        int i =0;
        while (i <= nums.length - 2) {
            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == target) {
                    return true;
                }
                if (sum < target) {
                    low = low + 1;
                }
                if (sum > target) {
                    high = high - 1;
                }
            }
            i = i+1;
        }
        return false;
    }

    static int sum(int[] nums, int i, int j, int k) {
        return nums[i] + nums[j] + nums[k];
    }
}
