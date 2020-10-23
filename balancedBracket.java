import java.util.Scanner;
import java.util.Stack;

public class balancedBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        Stack<Character> s = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            if(!s.empty() && (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{')){
                s.push(input.charAt(i));
            } else if(!s.empty() && s.peek() == '(' && input.charAt(i) == ')'){
                s.pop();
            } else if(!s.empty() && s.peek() == '{' && input.charAt(i) == '}'){
                s.pop();
            } else if(!s.empty() && s.peek() == '[' && input.charAt(i) == ']'){
                s.pop();
            }else{
                s.push(input.charAt(i));
            }
        }
        if(s.isEmpty()){
            System.out.println("Brackets are balanced");
        }else{
            System.out.println("Brackets are not balanced");
        }
    }
}