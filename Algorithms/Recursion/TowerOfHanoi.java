package Algorithms.Recursion;

public class TowerOfHanoi {

    static void towerFunc(int n, int fromRod, int toRod, int auxRod){
        if(n == 1){
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        towerFunc(n-1, 1, 2, 3);
        System.out.println("Move disk " + n +  " from rod " + fromRod + " to rod " + toRod);
        towerFunc(n-1, 2, 3, 1);
    }
    public static void main(String[] args) {
        towerFunc(3, 1, 3, 2);
    }
}