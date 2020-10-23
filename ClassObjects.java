class Cat{
    boolean hasFur;
    String color, breed;

    public void walk(){
        System.out.println("walking");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void description(){
        System.out.println("The cat's description " + color + " " + breed);
    }
}

// Classname objectName = new Classname();
public class ClassObjects {
   public static void main(String[] args) {
       Cat cat1 = new Cat();
       Cat cat2 = new Cat();

       cat1.breed = "feret";
       cat1.color = "brown";

       cat2.breed = "persian";
       cat2.color = "white";

       cat1.description();
       cat2.eat();
   }
}