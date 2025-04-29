// Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array

class Solution {
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length ; i++){
            largest = Math.max(arr[i], largest);
        }
        return largest;
        
    }
}
