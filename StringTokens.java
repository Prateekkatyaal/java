import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        // Write your code here. He is a very very good boy, isn't he?
        String[] words;
        int n = 0;
        if(s.length() > 0){
            words = s.split("[\\s'.,?!@_]+");
            n = words.length;
            System.out.println(n);
            for(String word: words){
                System.out.println(word);
            }
        }else{
            System.out.println(0);
        }
        
        scan.close();
    }
}