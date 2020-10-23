//Find triplets with zero sum
package TwoPointerAlgo;
import java.util.*;

public class TwoPointerAlgo {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            final int n = sc.nextInt();
            final int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            final Triplet g = new Triplet();
            if (g.findTriplets(a, n))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}

class Triplet {
    public boolean findTriplets(final int arr[], final int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            if (twoSum(arr, -arr[i], i))
                return true;
        }
        return false;
    }

    public boolean twoSum(final int a[], final int x, int i) {
        int j = a.length-1;
        while(i < j){
            if(a[i] + a[j] > x) j--;
            else if(a[i] + a[j] < x) i++;
            else return true;
        }
        return false;
    }
}