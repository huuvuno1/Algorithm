package easy;

import java.util.HashMap;
import java.util.Map;

/*
     * 1. Two Sum Easy Given an array of integers nums and an integer target, return
     * indices of the two numbers such that they add up to target. You may assume
     * that each input would have exactly one solution, and you may not use the same
     * element twice. You can return the answer in any order.
     * 
     * Example 1:
     * 
     * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
     * nums[1] == 9, we return [0, 1]. Example 2:
     * 
     * Input: nums = [3,2,4], target = 6 Output: [1,2] Example 3:
     * 
     * Input: nums = [3,3], target = 6 Output: [0,1]
     * 
     * 
     * Constraints:
     * 
     * 2 <= nums.length <= 104 -109 <= nums[i] <= 109 -109 <= target <= 109 Only one
     * valid answer exists.
     * 
     * 
*/

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 2, 4 };
        int[] result = twoSum2(nums, 6);
        System.out.println(result[0] + " " + result[1]);
    }

    // Runtime: 47 ms, faster than 36.61% of Java online submissions for Two Sum.
    // Memory Usage: 39.5 MB, less than 37.60% of Java online submissions for Two
    // Sum
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    /*
     * Runtime: 3 ms, faster than 65.51% of Java online submissions for Two Sum.
     * Memory Usage: 40.5 MB, less than 20.98% of Java online submissions for Two
     * Sum
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && (map.get(diff) != i))
                return new int[] { i, map.get(diff) };
        }
        return null;
    }

}