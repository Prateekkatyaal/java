import java.util.Scanner;

public class StrReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char a[] = A.toCharArray();
        int n = a.length;
        char b[] = new char[n];
        for(int i = 0, j = n-1; i < n && j >=0; i++, j--){
            b[j] = a[i];
        }
        boolean flag = true;
        for(int i = 0; i < n; i++){
            if(a[i] != b[i]){
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}