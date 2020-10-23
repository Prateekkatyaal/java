import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//size
        int a[] = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; i++){
            int s = a[i];
            for(int j = i + 1; j < n; j++){
                s = s + a[j];
            }
            if(s < 0) k++;
        }
        System.out.println(k);
    }
}