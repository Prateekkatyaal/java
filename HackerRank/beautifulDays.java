package HackerRank;

import java.util.*;

public class beautifulDays {

    public static int reverse(int n){
        int reverse = 0;
        while(n!=0){
            reverse = 10*reverse +n%10;
            n = n/10;
        }
        reverse += n;
        return reverse;
    }
    public static void main(String[] args) {
        int a = 13; int b = 45;
        int k = 3;

        int n = 0;

        String s = "siidhant";
        String st = "hello";
        s.equals(st);

        List<Character> list = new LinkedList<>();
        
        for(int i = a; i <= b; i++){
            int rev = reverse(i);
            System.out.println(rev);
        }
    }
}