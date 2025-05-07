// Link : https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(matrix[i][j] == 0){
                markZero(visited, i, j,matrix);
                }
            }
        }

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(visited[i][j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void markZero(boolean[][] visited, int i, int j, int[][] matrix){
        for(int rows = 0; rows<matrix.length ; rows++){
            if(matrix[rows][j] != 0 && !visited[rows][j] ){
                visited[rows][j] = true;
            }
        }
        for(int cols = 0; cols<matrix[0].length ; cols++){
            if(matrix[i][cols] != 0 && !visited[i][cols] ){
                visited[i][cols] = true;
            }
        }
        visited[i][j] = true;
    }
}
