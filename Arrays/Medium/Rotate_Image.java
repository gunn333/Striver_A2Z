// Link: https://leetcode.com/problems/rotate-image/ 

class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i<rows; i++){
            for(int j = i; j<cols; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i<rows; i++){
            reverseRow(matrix[i],0,rows-1);
        }
    }
    public void reverseRow(int[] matrix, int start, int end){
        while(start<end){
            int temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end]= temp;
            start++;
            end--;
        }
    }
}
