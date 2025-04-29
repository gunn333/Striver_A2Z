// Link : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

class Solution {
    public boolean check(int[] nums) {
        int break_pt = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i] > nums[(i+1)%nums.length]){
                break_pt++;
            }
            if(break_pt > 1){
                return false;
            }
        }   
        return true;
    }
}
