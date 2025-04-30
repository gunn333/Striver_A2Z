// Link: https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = 0;
        int maxlen = 0;

        for(int i = 0; i<nums.length ; i++){
            if(nums[i] == 1){
                length++;
            }else{
                maxlen = Math.max(maxlen,length);
                length = 0;
            }
        }
        maxlen = Math.max(maxlen, length);
        return maxlen;
    }
}
