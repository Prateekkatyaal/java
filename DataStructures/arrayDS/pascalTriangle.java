package DataStructures.arrayDS;

import java.util.*;

public class pascalTriangle {
    public static void main(String[] args) {
        int n = 5;

        List<List<Integer>> tri = new ArrayList<>();

        for(int i = 1; i < n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i - 1) row.add(1);
                else row.add(tri.get(i-2).get(j-1) + tri.get(i-2).get(j));
            }
            tri.add(row);
        }
    }
}
