package DataStructures.arrayDS;

import java.util.HashMap;
import java.util.Map;

public class subarraySumEqualsK {
    public static void main(String[] args) {
        
    }

    public int solution(int[] nums, int k){
        int c = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        int sum = 0;
        for(int i: nums){
            sum += i;
            if(map.containsKey(sum - k)){
                c += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return c;
    }
}
