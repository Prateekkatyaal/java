package DataStructures.arrayDS;

import java.util.*;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        
        int i = 0;
        while(i < intervals.length && intervals[i][1] < newInterval[0]) list.add(intervals[i++]);

        int[] mI = newInterval;
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            mI[0] = Math.min(intervals[i][0], newInterval[0]);
            mI[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        list.add(mI);

        while(i < intervals.length) list.add(intervals[i++]);

        return list.toArray(new int[list.size()][]);
    }
}
