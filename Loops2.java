import java.util.*;
public class Loops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a; 
            int d;
            int multi = 1;
            // s = a + multi*b
            for(int j = 0; j < n; j++){ 
                d = b*multi;               
                sum = sum + d;
                System.out.printf("%d ", sum);
                multi *= 2;               
            }
            System.out.println();
        }
        in.close();
    }
}