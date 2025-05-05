// Link: https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = 1;

        while (left < nums.length - 1) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { left, right };
            }
            right++;
            if (right == nums.length) {
                left++;
                right = left + 1;
            }
        }
        return null;
    }
}
