package Algorithms.Backtracking;

import java.util.*;

public class ShortestRoutes {
    public List<List<Integer>> printPaths(int[][] grid){
        List<List<Integer>> list = new ArrayList<>();
        helper(grid, list, new ArrayList<>(), grid.length, grid[0].length, 0, 0);
        return list;
    }

    public void helper(int[][] grid, List<List<Integer>> list, List<Integer> curr, int n, int m, int i, int j){
        curr.add(grid[i][j]);
        if(i == n-1 || j == m-1) list.add(new ArrayList<>(curr));
        else{
            if(i + 1 < n) helper(grid, list, curr, n, m, i+1, j);
            if(j + 1 < m) helper(grid, list, curr, n, m, i, j+1);
            if(i + 1 < n && j + 1 < m) helper(grid, list, curr, n, m, i+1, j+1);
        }
        curr.remove(curr.size()-1);
    } 
}
