//BubbleSort

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a[] = new int[5];
        int n = a.length;
        int temp;
        boolean swapped;

        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }

        scan.close();

        for(int i = 0; i < n - 1; i++){
            swapped =  false;

            for(int j = 0; j < n - 1 - i; j++){

                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }

            }

            if(!swapped) break;
        }

        for(int item: a){
            System.out.print(item + " ");
        }

    }
}