package Algorithms.Backtracking;

public class nQueens {
    public static void main(String[] args) {
        int n = 4;
        int[][] chess = new int[n][n];
        printQueens(chess, "", 0);
    }

    public int totalNQueens(int n){
        int[][] chess = new int[n][n];
        return countQueens(chess, 0);
    }

    public int countQueens(int[][] chess, int row){
        if(row == chess.length){
            return 1;
        }
        int  n = 0;
        for(int col = 0; col < chess.length; col++){
            if(queenSafe(chess, row, col)){
                chess[row][col] = 1;
                n += countQueens(chess, row+1);
                chess[row][col] = 0;
            }
        }
        return n;
    }

    public boolean queenSafe(int[][] chess, int row, int col){
        for(int i = row-1, j = col; i >= 0; i--){
            if(chess[i][j] == 1) return false;
        }
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1) return false;
        }
        for(int i = row-1, j = col+1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1) return false;
        }
        return true;
    }

    public static void printQueens(int[][] chess, String qsf, int row){
        if(row == chess.length){
            System.out.println(qsf);
            return;
        }

        for(int col = 0; col < chess.length; col++){
            if(isQueenSafe(chess, row, col)){
                chess[row][col] = 1;
                printQueens(chess, qsf + row + " - " + col + ", ", row+1);
                chess[row][col] = 0;
            }
            
        }
    }

    public static boolean isQueenSafe(int[][] chess, int row, int col){
        for(int i = row-1, j = col; i >= 0; i--){
            if(chess[i][j] == 1) return false;
        }
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1) return false;
        }
        for(int i = row-1, j = col+1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1) return false;
        }
        return true;
    }
}
