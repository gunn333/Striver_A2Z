// Link: https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int i = arr.length-1; i>=0 ; i--){
            if(arr[i] >= maxi){
                leaders.add(arr[i]);
                maxi = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
