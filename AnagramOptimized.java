public class AnagramOptimized {
    public static void main(String[] args) {
        String str1 = "Siddhant";
        String str2 = "siddhant";
        int s1[] = new int[256]; 
        int s2[] = new int[256];

        boolean flag = true;

        if(str1.length() == str2.length()){
            for(char c: str1.toCharArray()){
                int index = (int) c;
                s1[index]++;
            }
    
            for(char c: str2.toCharArray()){
                int index = (int) c;
                s2[index]++;
            }
    
            for(int i = 0; i < s1.length; i++){
                flag = true;
                if(s1[i] != s2[i]){
                    flag = false;
                    break;
                }
            }
        }else{
            flag = false;
        }
        if(flag){
            System.out.println("This is anagram");
        }else{
            System.out.println("This is not anagram");
        }

    }
}