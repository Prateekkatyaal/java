package DAA;

public class binarySearch {
    public static void main(String[] args) {
        int a[] = { 2, 4, 1, 5, 6, 10 };
        System.out.println(searchBinary(a, 0, a.length-1, 5));
    }

    static int searchBinary(int arr[], int l, int r, int x){
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            if (arr[mid] == x) return mid; 
  
            if (arr[mid] > x) return searchBinary(arr, l, mid - 1, x); 

            return searchBinary(arr, mid + 1, r, x); 

        } 
        return -1; 
    }
}
