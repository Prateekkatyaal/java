package DataStructures.arrayDS;

public class minpathsum {
    public static void main(String[] args) {
        
    }

    public int solveFunction(int[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;
        
        if(rows == 0) return 0;

        int dp[][] = new int[rows][cols];

        dp[0][0] = grid[0][0];

        //Sum of First row
        for(int i = 1; i < cols; i++) dp[0][i] = grid[0][i] + dp[0][i-1];

        //Sum of First Col
        for(int i = 1; i < rows; i++) dp[i][0] = grid[i][0] + dp[i-1][0];

        //
        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++) dp[i][j] = grid[i][j] + Math.min(grid[i-1][j], grid[i][j-1]);
        }

        return grid[rows-1][cols-1];
    }
}
