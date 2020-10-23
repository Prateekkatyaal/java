import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
//        int a[][] = new int[3][3];

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter col: ");

        int col = scan.nextInt();

        System.out.print("Enter rows: ");

        int row = scan.nextInt();

        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                a[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                b[i][j] = scan.nextInt();
            }
        }

        int c[][] = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }

    }
}