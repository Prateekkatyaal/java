package Algorithms.Recursion;

public class Problem7 {
    public static void main(String[] args) {

        System.out.println(fibSeries(9));
    }

    static int fibSeries(int n){
        if(n <= 1){
            return n;
        }
        return fibSeries(n - 1) + fibSeries(n - 2);
    }

}
// Fibonnaci series