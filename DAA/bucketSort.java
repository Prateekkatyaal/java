package DAA;

import java.util.Collections;
import java.util.Vector;

public class bucketSort {

    public static void sort(float a[], int n){
        if(n <= 0) return;

        Vector<Float>[] buckets = new Vector[n];

        for(int i = 0; i < n; i++) buckets[i] = new Vector<Float>();

        for(int i = 0; i < n; i++){
            float idx = a[i] * n;
            buckets[(int)idx].add(a[i]);
        }

        for(int i = 0; i < n; i++) Collections.sort(buckets[i]);

        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < buckets.length; j++) a[index++] = buckets[i].get(j);
        }

    }
    public static void main(String[] args) {
        float a[] = { (float)0.897, (float)0.565, 
            (float)0.656, (float)0.1234, 
            (float)0.665, (float)0.3434 };

        int n = a.length;
        sort(a, n);

        for(float i: a) System.out.println(i + " ");
    }
}
