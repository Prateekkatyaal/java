package VectorsAndStacks;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class EqualStacks {
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int n1 = h1.length;
        int n2 = h2.length;
        int n3 = h3.length;
        
            Stack<Integer> s1 = new Stack<>();
            Stack<Integer> s2 = new Stack<>();
            Stack<Integer> s3 = new Stack<>();

            int sum = 0;

            for(int i = n1-1; i >= 0; i--){
                sum = sum + h1[i];
                s1.push(sum);
            }
            sum = 0;
            for(int i = n2-1; i >= 0; i--){
                sum = sum + h2[i];
                s2.push(sum);
            }
            sum = 0;
            for(int i = n3-1; i >= 0; i--){
                sum = sum + h3[i];
                s3.push(sum);
            }
            while(true){
                if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty()) return 0;

                int s1H = s1.peek();
                int s2H = s2.peek();
                int s3H = s3.peek();

                if(s1H == s2H && s2H == s3H) return s1H;
                else if(s1H >= s2H && s1H >= s3H) s1.pop();
                else if(s2H >= s1H && s2H >= s3H) s2.pop();
                else if(s3H >= s1H && s3H >= s2H) s3.pop();
            }
        }


    }