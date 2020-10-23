package DataStructures.arrayDS;

import java.util.*;

public class equillibruimPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		    
		    int mid = n/2;
		    
		    if(n == 1){
		        System.out.println(a[0]);
		        break;
		    }
		    
		    int temp[] = new int[n];
		    int sum = 0;
		    for(int i = 0; i < n; i++){
		        sum += a[i];
		        temp[i] = sum;
		    }
		    boolean flag = false;
		    while(mid > 0 && mid < n-1){
		        int sumLeft = temp[mid-1];
		        int sumRight = temp[n-1] - temp[mid];
		        if(sumLeft == sumRight){
		            flag = true;
		            break;
		        }else if(sumLeft < sumRight){
		            mid++;
		        }else if(sumLeft > sumRight){
		            mid--;
		        }
		    }
		    if(flag) System.out.println(mid+1);
		    else System.out.println(-1);
		}
		sc.close();
    }
}
