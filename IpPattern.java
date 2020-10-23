import java.util.Scanner;

public class IpPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();        
        sc.close();

        boolean ifValid = true;       
        String strArray[];
        strArray = str.split("\\.");
        
        if(strArray.length == 4){
            for(String iString: strArray){
                int n = iString.length();
                if(n > 0 && n < 4){
                    int i = Integer.parseInt(iString);
                    if(i >= 0 && i <= 255) ifValid = true;
                    else{
                        ifValid = false;
                        break;
                    }
                }else{
                    ifValid = false;
                    break;
                }
            }
        }else{
            ifValid = false;
        }     

        if(ifValid)System.out.println("true");
        else System.out.println("false");
    }
}