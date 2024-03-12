package org.tfoc;

import java.util.HashMap;
import java.util.Map;

/**
 * The class containing the solution to this exercise
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            var num = nums[index];
            var diff = target - num;
            var diffIndex = indices.get(diff);

            if (diffIndex == null) {
                indices.put(num, index);
            } else {
                return new int[] {index, diffIndex};
            }
        }

        throw new IllegalStateException("No solution found!");
    }
}
