// Link: https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        int majority = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int count = map.getOrDefault(nums[i], 0) +1;
            map.put(nums[i], count);

            if(count > majority){
                result = nums[i];
                majority = count;
            }
        }
        return result;
    }
}
