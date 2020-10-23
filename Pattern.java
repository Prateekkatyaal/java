import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();

//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n - i; j++){
//                System.out.print("  ");
//            }
//            for(int j = 1; j <= i; j++){
//                System.out.print("*  ");
//            }

//            System.out.println();

//        }

        int k = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(k + "  ");
                k++;
            }

            System.out.println();
        }
    }
}