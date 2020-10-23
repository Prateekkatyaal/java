import java.util.Scanner;

public class StringPerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        char a[] = str.toCharArray();
        char temp;
        int n = a.length;
        
        
        double fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact*i;
        }

        //while(fact-- > 0){
            //Step 1
            int x = -1;
            for(int i = 0; i < n - 1; i++){
                if(Character.compare(a[i], a[i + 1]) < 0){
                    x = i;
                }
            }

            if(x == -1){
                System.out.println("Finished");
                return;
            }

            int y = -1;

            //Step 2
            for(int i = 0; i < n; i++){
                if(Character.compare(a[x], a[i]) < 0){
                    y = i;
                }
            }
            
            //Step 3
            temp = a[y];
            a[y] = a[x];
            a[x] = temp;

            //Step 4
            int i = x, j = n - x - 1;
            while(i < j){
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++; j--;
            }

            System.out.println(a);
        //}
        
                
    }
}