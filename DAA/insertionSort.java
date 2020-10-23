package DAA;

public class insertionSort{
    public static void main(String[] args) {
        int array[] = {2, 7, 5, 10, 3, 1};

        int res[] = sortInsertion(array, array.length);

        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }

    }
    static int[] sortInsertion(int a[], int n){

        for(int i = 1; i < n; i++){
            int key = a[i];
            int j = i-1;

            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }

        return a;
    }
}