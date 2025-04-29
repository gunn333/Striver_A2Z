// Link: https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0 || nums.length == 0){
            return;
        }
        k = k%nums.length;
        reverse(0, nums.length-1, nums);
        reverse(0, k-1, nums);
        reverse(k, nums.length-1, nums);
    }

    public void reverse(int start, int end , int[] nums){
        while(start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}
