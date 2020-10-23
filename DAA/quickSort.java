package DAA;

public class quickSort {

    public void sort(int a[], int l, int h){
        if(l < h){
            int pi = partition(a, l, h);

            sort(a, l, pi-1);
            sort(a, pi+1, h);
        }
    }

    public int partition(int[] a, int l, int h){
        int pivot = a[h];
        int i = l-1;

        for(int j = l; j < h; j++){
            if(a[j] < pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[h];
        a[h] = temp;

        return i;
    }
    public static void main(String[] args) {
        int a[] = {10, 7, 8, 11, 3};
        int n = a.length;

        quickSort qs = new quickSort();

        qs.sort(a, 0, n-1);

        for(int i: a) System.out.println(i);
    }
}
