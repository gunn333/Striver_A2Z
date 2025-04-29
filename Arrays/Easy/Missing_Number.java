// Link : https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int OriginalSum = 0;

        for(int i = 0; i<nums.length ; i++){
            sum += nums[i];
            OriginalSum += i+1;
        }
        return OriginalSum-sum;
    }
}
