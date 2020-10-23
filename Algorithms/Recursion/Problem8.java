package Algorithms.Recursion;

//import java.util.Arrays;

public class Problem8 {
    public static void main(String[] args) {
        int n = 1231;
        String s = Integer.toString(n);
        char a[] = s.toCharArray();

        if(isPalin(a, 0, a.length-1)){
            System.out.println("this is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }


    }

    static boolean isPalin(char a[], int start, int end){
       // if
        if(start < end) return isPalin(a, start, end);
        return false;
    }
}
//Palindrome of a number