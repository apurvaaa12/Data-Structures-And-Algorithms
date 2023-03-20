//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//Input: nums = [3,2,4], target = 6
//Output: [1,2]


import java.util.HashMap;
import java.util.Map;

public class TwoSumLeetCode {

    public int[] twoSum( int[] nums, int target){

        //Array to Store the result
        int[] result = new int[2];
        //Map  will store the difference and the index
        Map<Integer, Integer> map = new HashMap<>();
        //loop through the array
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;

}
}
