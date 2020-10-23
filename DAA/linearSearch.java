package DAA;

public class linearSearch {

    public static int searchLinear(int a[], int k){
        boolean flag = false;
        int i = 0;
        for( ; i < a.length; i++){
            if(a[i] == k){
                flag = true;
                break;
            }
        }
        if(flag) return i;
        else return -1;
    }
    public static void main(String[] args) {
        int a[] = {2, 4, 1, 5, 6, 10};
        int k = 1;
        System.out.println(searchLinear(a, k));
    }
}