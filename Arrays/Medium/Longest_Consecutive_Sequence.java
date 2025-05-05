// Link: https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int length = 1;
        int maxlen = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]) {
                continue;
            } else if(nums[i] == nums[i - 1] + 1){
                length++;
            } else {
                maxlen = Math.max(maxlen, length);
                length = 1;
            }
        }

        maxlen = Math.max(maxlen, length);
        return maxlen;
    }
}
