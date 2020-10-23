package DAA;

public class fibonacci {
    public static void main(String[] args) {

        int x = 10;
        for(int i = 0; i <= x; i++){
            System.out.print(fibSeries(i) + " ");
        }
        
    }

    static int fibSeries(int n){
        if(n <= 1) return n;

        return fibSeries(n-1) + fibSeries(n-2);
    }
}
