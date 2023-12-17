package org.example;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> result = generateCombinations(nums, target);
        System.out.println("Result: " + result);
    }

    public static List<List<Integer>> generateCombinations(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);
        // Use set to store unique list
        Set<List<Integer>> pair = new HashSet<>();
        int n = nums.length;

        for (int i=0; i<n-3; i++) {
            for (int j=i+1; j<n-2; j++) {
                int low = j+1;
                int high = n-1;
                long newTarget = (long)target - ((long)nums[i] + (long)nums[j]);

                while (low < high) {
                    if (nums[low] + nums[high] > newTarget) {
                        high--;
                    } else if (nums[low] + nums[high] < newTarget) {
                        low++;
                    } else {
                        pair.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        high--;
                        low++;
                    }
                }
            }
        }
        return new ArrayList<>(pair);
    }

}
