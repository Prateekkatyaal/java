package Algorithms.Backtracking;
import java.util.*;

public class palinPartition {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(s, new ArrayList<>(), list, 0);
        return list;
    }

    public void backtrack(String s, List<String> curr, List<List<String>> list, int start){
        if(start == s.length()){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i < s.length(); i++){
            if(isPalin(s, start, i)){
                curr.add(s.substring(start, i+1));
                backtrack(s, curr, list, i+1);
                curr.remove(curr.size()-1);
            }
        }
    }

    public boolean isPalin(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
