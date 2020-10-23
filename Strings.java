public class Strings {
   public static void main(String[] args) {
       
        String name =  "Sid"; // Initialization by Literals // Stored in String Pool(cache) for optimization
        System.out.println(name);

        String message =  new String("Sid"); //Stored in Heap Memory also in String Pool

        System.out.println(name == message);
        System.out.println(name.equals(message));
        System.out.println(name.concat(message));
        System.out.println(name.replace('S', 's'));

        message = "";

        System.out.println(message.isEmpty());

        message = "Hello, My Name is Sid";
        String words[] = message.split(" ");
        
        for(String word: words){
           System.out.println(word);
           
        }

        System.out.println(message.indexOf('e'));

        System.out.println(message.charAt(1));

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        message = "     hello world           ";

        System.out.println(message.trim());

        message = message.trim();
        
   } 
}