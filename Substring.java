import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine(); int k = scan.nextInt();
        String smallest = "";
        String largest = "";

        scan.close();

        int n = s.length();

        int i = 0; boolean flag = true;
        String tempString = ""; 
        while(i + (k-1) < n){
            tempString = s.substring(i, i + k);
            
            if(flag){
                largest = tempString;
                smallest = tempString;
                flag = false;
            }else{
                if(tempString.compareTo(smallest) < 0){
                    smallest = tempString;
                }else if(tempString.compareTo(largest) > 0){
                    largest= tempString;
                }
            }
            i++;            
        }
        System.out.println(smallest + "\n" + largest);
    }
}