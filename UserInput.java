import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        System.out.println(x + ' ');

        String name = scan.nextLine();
        System.out.println(name);
        scan.close();
    }
}