package DAA;

import java.util.*;

public class countingSort {

    public static void sort(int a[]){
        int max = Arrays.stream(a).max().getAsInt(); 
        int min = Arrays.stream(a).min().getAsInt(); 
        int range = max - min + 1; 
        int count[] = new int[range]; 
        int output[] = new int[a.length]; 
        for (int i = 0; i < a.length; i++) { 
            count[a[i] - min]++; 
        } 
  
        for (int i = 1; i < count.length; i++) { 
            count[i] += count[i - 1]; 
        } 
  
        for (int i = a.length - 1; i >= 0; i--) { 
            output[count[a[i] - min] - 1] = a[i]; 
            count[a[i] - min]--; 
        } 
  
        for (int i = 0; i < a.length; i++) { 
            a[i] = output[i]; 
        } 
    }
    public static void main(String[] args) {
        int a[] = {};
        
        sort(a);

        for(int i: a) System.out.println(i + " ");

    }
}
