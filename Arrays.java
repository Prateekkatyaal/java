public class Arrays {
    public static void main(String[] args) {
        int[] listNumbers =  new int[10];

        // int rollNumber[], classes; // to declare multiple variables alongside an array
        // rollNumber = new int[2];

        int[] age = {12, 25, 11};

        double[] marks = {1.0, 45.2, 58.7};

        System.out.print("Age : ");

        for(int i = 0; i < age.length; i++){
            System.out.print(age[i]);
        }

        System.out.println();

        System.out.print("Marks: ");

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i]);
        }

        String a = "hello";
        String b = "java";

        char a1[] = {'h', 'e', 'l', 'l', 'o'};
        a1[0] = Character.toUpperCase(a1[0]);
        System.out.println(a1);
        a = new String(a1);
        System.out.println(a + ' ' + b);

        char b1[] = b.toCharArray();
        System.out.println(b1.equals(a1));

    }
}