// Link : https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest

class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                seclargest = largest;
                largest = arr[i];
            }else if(arr[i] > seclargest && arr[i] != largest){
                seclargest = arr[i];
            }
        }
        
        if(seclargest != Integer.MIN_VALUE){
            return seclargest;
        }
        return -1;
    }
}
