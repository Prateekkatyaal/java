package DataStructures.arrayDS;

public class arrayRotation {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int d = 2;
        int n =  a.length;

        int res[] = new int[n];

        for(int i = 0; i < n; i++){
            int newIndex = (i + (n-d)) % n;
            res[newIndex] = a[i];
        }

        printArray(a);

        printArray(res);
    }

    private static void printArray(int a[]){
        for(int i: a){
            System.out.print(i + " ");
        }
    }
}
