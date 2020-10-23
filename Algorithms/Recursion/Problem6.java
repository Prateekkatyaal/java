package Algorithms.Recursion;

public class Problem6 {

    public static void main(String[] args) {
        int a[] = {1, 5, 7, 3, 2, 4};
        System.out.println(coinGame(a, 0, a.length - 1));
    }

    static int coinGame(int a[], int l, int r){
        if(l+1 == r) return Math.max(a[l], a[r]);
        return Math.max(a[l] + Math.min(coinGame(a, l + 2, r), coinGame(a, l, r - 2)), 
                        a[r] + Math.min(coinGame(a, l+1, r-1), coinGame(a, l, r-2)));
    }
    
}
//GameTheory: Optmal strategy to win a coin game