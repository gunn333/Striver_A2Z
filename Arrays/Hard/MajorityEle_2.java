// Link: https://leetcode.com/problems/majority-element-ii/

import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int majority = nums.length / 3;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], count);

            if (count > majority && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}
