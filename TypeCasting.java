public class TypeCasting {
    public static void main(String[] args) {
        //Automatic type casting
        byte x = 4;
        int y = x;
        double z = y; 
        System.out.println(z);

        // Manual Type Casting
        double doubleVal = 3.14;
        int intVal = (int) doubleVal;
        System.out.println(intVal);
    }
}