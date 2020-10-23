import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList();
        List<String> cars = new ArrayList();
        fruits.add("apple");
        cars.add("maruti");
        cars.add("bmw");

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        
        fruits.addAll(cars); //adds cars to fruits list

        System.out.println(fruits.get(1));

        cars.set(1, "hyundai");
        System.out.println(cars.get(1));

        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("banana");
        fruits.add("hi");
        System.out.println(fruits);
        fruits.remove(6);
        System.out.println(fruits);

        

        List<String> toRemove = new LinkedList();
        toRemove.add("bmw");
        toRemove.add("maruti");
        fruits.removeAll(toRemove);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.contains("bmw"));
        System.out.println(cars.isEmpty());

        Object x[] = fruits.toArray();//returns array of objects
        //or
        String y[] = new String[fruits.size()];
        fruits.toArray(y); // returns array of data type we know already
        Collections.frequency(fruits, "bmw");
        for(String s: y) System.out.println(s);

        List<Integer> ls1 = new LinkedList();
        ls1.add(11);
        ls1.add(46);
        ls1.add(0, 10);
        int k = (int) (Math.ceil((double)ls1.get(1)/(double)5))*5;
        System.out.println(k);

        fruits.clear();
        System.out.println(fruits);
    }
}
/* 
Methods
1. add(element) - adds element in the list
2. addAll(Collection) - 
3. get(index)
4. set(index, value)
5. remove(index)
6. removeAll()
7. clear()
8. size()
9. contains()
10. isEmpty()
11. toArray()
*/