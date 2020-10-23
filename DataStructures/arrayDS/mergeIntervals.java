package DataStructures.arrayDS;

import java.util.*;

public class mergeIntervals {
    public static void main(String[] args) {
        
    }

    public int[][] merge(int[][] intervals){
        if(intervals.length == 0) return intervals;

        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();

        int[] in = intervals[0];

        int i = 1;
        while(i < intervals.length){
            if(intervals[i][0] > in[1]){
                list.add(in);
                in = intervals[i];
            }else{
                in[1] = Math.max(intervals[i][1], in[1]);
            }
            i++;
        }
        return list.toArray(new int[list.size()][]);
        
    }
}
