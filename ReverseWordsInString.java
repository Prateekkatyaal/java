public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "I love cricket and programming";
        String words[] = str.split(" ");
        int n =  words.length;
        
        System.out.println(str);
        for(int i = n-1; i >= 0; i--){
            System.out.print(words[i] + ' ');
        }
    }
}