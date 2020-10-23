package Algorithms.Backtracking;

import java.util.*;

public class combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combos = new ArrayList<>();

        combine(combos, new ArrayList<Integer>(), 1, n, k);

        return combos;
    }

    public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
		if(k==0) {
			combs.add(new ArrayList<Integer>(comb));
			return;
		}
		for(int i = start; i<=n; i++) {
			comb.add(i);
			combine(combs, comb, i+1, n, k-1);
			comb.remove(comb.size()-1);
		}
	}
    
}
