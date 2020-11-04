package DataStructures.arrayDS;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            if(binSearch(matrix, target, i, 0, matrix[0].length-1)) return true;
        }
        return false;
    }

    public boolean binSearch(int[][] matrix, int target, int row, int l, int r){
        if(l <= r){
            int mid = l + (r - l) / 2;  
            if(matrix[row][mid] == target) return true;
            if(matrix[row][mid] > target) return binSearch(matrix, target, row, l, mid-1);
            return binSearch(matrix, target, row, mid+1, r);
        }
        return false;
    }
}
