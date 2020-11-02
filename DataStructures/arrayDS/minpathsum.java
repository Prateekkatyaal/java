package DataStructures.arrayDS;

public class minpathsum {
    public static void main(String[] args) {
        
    }

    public int minPathSum(int[][] grid) {        
        if(grid.length == 0) return 0;

        for(int i = 1; i < grid[0].length; i++) grid[0][i] = grid[0][i] + grid[0][i-1];

        for(int i = 1; i < grid.length; i++) grid[i][0] = grid[i][0] + grid[i-1][0];

        for(int i = 1; i < grid.length; i++){
            for(int j = 1; j < grid[0].length; j++) grid[i][j] = grid[i][j] + Math.min(grid[i-1][j], grid[i][j-1]);
        }

        return grid[grid.length-1][grid[0].length-1];
    }
    int[][] table = null;
    public int minPathSum2(int[][] grid) {        
        int rows = grid.length;
        int cols = grid[0].length;
        table = new int[rows][cols];

        return helper(grid, grid.length-1, grid[0].length-1);
    }

    public int helper(int[][] grid, int row, int col){
        if(row < 0 || col < 0) return Integer.MAX_VALUE;

        if(row == 0 && col == 0) return grid[row][col];
        
        if(table[row][col] != 0) return table[row][col];

        table[row][col] = grid[row][col] + Math.min(helper(grid, row-1, col), helper(grid, row, col-1));

        return table[row][col];
    }

}
