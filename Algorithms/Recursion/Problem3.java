package Algorithms.Recursion;

public class Problem3 {

    public static void main(String[] args) {
        System.out.println(pathFinder(4, 4));
    }

    static int pathFinder(int n, int m){
        if(n == 1 || m == 1) return 1;
        return pathFinder(n, m-1) + pathFinder(n-1, m);
    }
    
}
//Find all the paths in nxm grid