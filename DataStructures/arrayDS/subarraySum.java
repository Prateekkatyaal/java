package DataStructures.arrayDS;

import java.util.*;

public class subarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int s = sc.nextInt();
		    int a[] = new int[n+1];
		    for(int i = 1; i < n+1; i++) a[i] = sc.nextInt();
		    
		    int start = 1;
		    int end = 1;
		    int sum = a[1];
		    while(end < n+1 && start < n && end < start){
		        if(sum < s){
		            end++;
		            if(end < n+1) sum += a[end];
		            if(sum == s) break;
		        }else if(sum > s){
		            sum = sum - a[start];
		            start++;
		            if(sum == s) break;
		        }else{
		            break;
		        }
		    }
            if(sum != s) System.out.println(-1);
            else System.out.println(start + " " + end);
		}
        sc.close();
    }
}
