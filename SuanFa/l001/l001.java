package SuanFa.l001;

import java.util.HashMap;
import java.util.Map;

public class l001 {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int gap = target - nums[i];
            if(map.get(gap)!= null && (int)map.get(gap)!= i){
                res[0] = i;
                res[1] = map.get(gap);
                break;
            }
        }
        return res;
    }
}
