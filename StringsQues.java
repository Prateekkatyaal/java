import java.util.*;

public class StringsQues {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());

        A = A.toLowerCase();
        B = B.toLowerCase();

        int a[] = new int[A.length()];
        int b[] = new int[B.length()];
        int i = 0;

        for(char c: A.toCharArray()){
            a[i] = (int) c;
            i++;
        }
        i = 0;
        for(char c: B.toCharArray()){
            b[i] = (int) c;
            i++;
        }
        boolean isOrder = true;
        if(!A.equals(B)){
            if(A.length() <= B.length()){
                for(i = 0; i < A.length(); i++){
                    if(a[i] > b[i]){
                        isOrder = true;
                        break;
                    }else if(a[i] < b[i]){
                        isOrder = false;
                        break;
                    }else{
                        continue;
                    }
                }
            }else{
                for(i = 0; i < B.length(); i++){
                    if(a[i] > b[i]){
                        isOrder = true;
                        break;
                    }else if(a[i] < b[i]){
                        isOrder = false;
                        break;
                    }else{
                        continue;
                    }
                }
            }
        }else{
            isOrder = false;
        }
        
        if(isOrder){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        char x[] = A.toCharArray();
        char y[] = B.toCharArray();

        x[0] = Character.toUpperCase(x[0]);
        y[0] = Character.toUpperCase(y[0]);

        A = new String(x);
        B = new String(y);

        System.out.println(A + ' ' + B);
    }
}



