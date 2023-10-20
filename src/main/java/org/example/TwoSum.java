package org.example;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] test1 = {2,7,11,15};
        int target1 = 9;
        System.out.println(Arrays.toString(twoSum(test1, target1)));
    }

    static int[] twoSum(int[] nums, int target) {
        int tmp[] = {0,1};
        int result[] = {0,1};
        for (int i=0; i<nums.length; i++) {
            tmp[0] = nums[i];
            for (int j=i+1; j<nums.length; j++) {
                tmp[1] = nums[j];
                if ((tmp[0] + tmp[1]) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        // In the constraint,
        // will not run to this
        return result;
    }
}