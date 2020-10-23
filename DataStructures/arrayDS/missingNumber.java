package DataStructures.arrayDS;

import java.util.*;

public class missingNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i = 0; i < n-1; i++) a[i] = sc.nextInt();
		    Arrays.sort(a);
		    for(int i = 1; i < n+1; i++){
		        if(a[i] - a[i-1] > 1){
		            System.out.println(a[i] - 1);
		            break;
		        }
		    }
        }
        sc.close();
    }
}