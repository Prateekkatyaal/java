import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = new int[5];
        int n = a.length;
        
        Scanner scan = new Scanner(System.in);
        
        for(int i =  0; i < n; i++){
            a[i] = scan.nextInt();
        }

        int minIndex;
        int temp;

        for(int i = 0; i < n - 1; i++){
            minIndex = i;
            for(int j = i; j < n; j++){
                if(a[minIndex] > a[j]){
                    minIndex = j;
                }
            }
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        for(int item: a){
            System.out.print(item + " ");
        }
    }
}