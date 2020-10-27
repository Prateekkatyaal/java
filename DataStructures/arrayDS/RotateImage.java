package DataStructures.arrayDS;

public class RotateImage {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i = 0; i < matrix.length; i++){
            reverse(matrix, i);
        }
    }
    public void transpose(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
            }
        }
    }
    public void reverse(int[][] matrix, int row){
        int l = 0;
        int r = matrix[row].length-1;
        while(l < r){
            int temp = matrix[row][l];
            matrix[row][l] = matrix[row][r];
            matrix[row][r] = temp;
            l++;
            r--;
        }
    }
}
