package DataStructures.arrayDS;

import java.util.*;

public class maxDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		    
		    int left[] = new int[n];
		    int right[] = new int[n];
		    
		    left[0] = a[0];
		    right[n-1] = a[n-1];
		    
		    for(int i = 1; i < n; i++) left[i] = Math.min(left[i-1],a[i]);
		    for(int i = n - 2; i >= 0; i--) right[i] = Math.max(right[i+1], a[i]);
		    
		    int i = 0; int j = 0; int ans = 0;
		    
		    while(i < n && j < n){
		        if(right[j] >= left[i]){
		            ans = Math.max(ans, j - i);
		            j++;
		        }
		        else i++;
		    }
		    System.out.println(ans);
        }
        sc.close();
    }
}
