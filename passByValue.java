class Dog {
    int legs;
}

public class passByValue {

    static void swapFunc(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swapFunc(Dog a, Dog b){
        Dog temp = a;
        a = b;
        b = a;

    }
    static void changeVal(Dog a, Dog b){
        a.legs = 10;
        b.legs = 5;
    }
    public static void main(String[] args) {
        // int x = 10;
        // int y = 5;

        // swapFunc(x, y);
        Dog x = new Dog();
        x.legs = 3;
        Dog y = new Dog();
        y.legs = 4;
        System.out.println("##Pass By Value##");
        System.out.println(x.legs + " " + y.legs);
        changeVal(x, y);
        System.out.println("##Pass By Reference##");
        System.out.println(x.legs + " " + y.legs);


        
    }
   
}