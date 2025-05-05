// Link: https://leetcode.com/problems/maximum-product-subarray/

class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int product = 1;

        // Left to Right
        for(int i = 0; i<nums.length; i++){
            product *= nums[i];
            ans = Math.max(product, ans);
            if(product == 0){
                product = 1;
            }
        }

        product = 1;
        // Right to Left
        for(int i = nums.length-1; i>=0; i--){
            product *= nums[i];
            ans = Math.max(product, ans);

            if(product == 0){
                product = 1;
            }
        }

        return ans;
    }
}
