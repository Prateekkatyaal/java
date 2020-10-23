public class AnagramString {
    public static void main(String[] args) {
        String str1 = "siddhant";
        String str2 = "sidhaant";
        int n1 = str1.length(); int n2 = str2.length();
        boolean isAnagram = false;
        boolean visited[] = new boolean[n2];

        if(n1 == n2){

            for(int i = 0; i < n1; i++){
                char c = str1.charAt(i);
                isAnagram = false;
                for(int j = 0; j < n2; j++){
                    if(str2.charAt(j) == c && !visited[j]){
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if(!isAnagram){
                    break;
                }
            }

        }else{
            isAnagram = false;
        }
        
        if(isAnagram){
            System.out.println("This is anagram");
        }else{
            System.out.println("This is not anagram");
        }
    }
}