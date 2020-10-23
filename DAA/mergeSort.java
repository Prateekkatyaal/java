package DAA;

public class mergeSort {
    public static void main(String[] args) {
        int array[] = {2, 7, 5, 10, 3, 1};
        sortMerge(array, 0, array.length - 1);

        for(int i: array){
            System.out.print(i + " ");
        }
    }

    static void sortMerge(int array[], int l, int r){
        if(l < r){
            int m = (l+r)/2;

            sortMerge(array, l, m);
            sortMerge(array, m+1, r);

            merge(array, l, m, r);
        }
    }

    static void merge(int array[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++) L[i] = array[l+i];
        for(int i = 0; i < n2; i++) R[i] = array[m + 1 + i];

        int i = 0, j = 0;
        int k = l;

        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                array[k] = L[i];
                i++;
            }else{
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            array[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
