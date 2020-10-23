package Algorithms.Recursion;

//import java.util.*;

public class Problem2 {

    static int stepCount = 0;

    static int pow(int a, int b){
        stepCount++;
        if(b == 0) return 1;
        return a * pow(a, b - 1);
    }
    static int powFast(int a, int b){
        stepCount++;
        if(b == 0) return 1;
        if(b%2 == 0){
            return powFast(a*a, b/2);
        }else{
            return a*powFast(a, b-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(powFast(3, 10000));
        System.out.println("Steps: " + stepCount);

        System.out.println(pow(3, 10000));
        System.out.println("Steps: " + stepCount);
    }
}
//Calculate power a^b
//pow(a,b) is normal function
//powFast(a,b) in optimized function