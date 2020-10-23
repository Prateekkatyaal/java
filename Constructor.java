class vehicle {
    int wheels, headlights;
    String color;
    //Parameterized Constructor
    // vehicle(int a){
    //     wheels = a;
    //     headlights = 2;
    // }
    vehicle(int wheels){
        this.wheels = wheels;
    }
    vehicle(int wheels, String color){
        this.wheels = wheels;
        this.color = color;
        headlights = 2;
    }
    //Default Constructor
    vehicle(){

    }
}
public class Constructor {
    //No-Arguement Constructor
    Constructor(){
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        vehicle car = new vehicle(4);
        vehicle bike = new vehicle(2);
        vehicle rickshaw = new vehicle(3, "yellow");
        System.out.println(car.wheels);
    }
}