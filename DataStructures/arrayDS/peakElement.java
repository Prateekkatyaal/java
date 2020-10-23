package DataStructures.arrayDS;

public class peakElement {
    public static void main(String[] args) {
        int a[] = {1, 1, 2, 9, 6};
        int n = a.length;

        System.out.println(peak(a, n));
    }

    public static int peak(int[] a, int n)
    {
       if(n == 1) return 0;
       
       if(a[0] > a[1]) return 0;
       
       if(a[n-1] > a[n-2]) return n-1;
       
       return getElements(a, 1, n-2);
    }
    
    public static int getElements(int a[], int l, int r){
        if(l == r) return l;
        int mid = l + (r-l)/2;
        if(a[mid] >= a[mid+1] && a[mid] >= a[mid-1]) return mid;
        if(a[mid - 1] <= a[mid]) return getElements(a, mid+1, r);
        return getElements(a, l, mid-1);
    }
}
