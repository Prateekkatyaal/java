package DAA;

import java.util.Arrays;

public class radixSort {

    public int getMax(int a[], int n){
        int max = a[0];
        
        for(int i = 1; i < n; i++) if(a[i] > max) max = a[i];

        return max;
    }

    public void countSort(int[] a, int n, int e){
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        for (i = 0; i < n; i++)
            count[(a[i] / e) % 10]++;
 
        
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        for (i = n - 1; i >= 0; i--) {
            output[count[(a[i] / e) % 10] - 1] = a[i];
            count[(a[i] / e) % 10]--;
        }
 
        for (i = 0; i < n; i++)
            a[i] = output[i];
    }

    public void sort(int a[]){
        int m = getMax(a, a.length);

        for(int e = 1; m/e > 0; e *= 10) countSort(a, a.length, e);
    }
    public static void main(String[] args) {
        
    }
}
