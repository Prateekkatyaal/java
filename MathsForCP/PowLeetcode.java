package MathsForCP;

public class PowLeetcode {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n%2 == 0){
            return myPow(x*x, (int)n/2);
        }else if(n < 0){
            return myPow(1/x, -n);
        }else{
            return x*myPow(x, n-1);
        }
    }
}
