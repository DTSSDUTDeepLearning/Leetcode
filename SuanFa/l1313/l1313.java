package SuanFa.l1313;

import java.util.LinkedList;
import java.util.List;

public class l1313 {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new LinkedList<>();
        int len = nums.length;
        for (int i = 0;i < len;i+=2) {
            for (int j = 0;j < nums[i];j++) {
                result.add(nums[i+1]);
            }
        }
        len = result.size();
        int[] result_int = new int[len];
        for (int i = 0;i < len;i++) {
            result_int[i] = result.get(i);
        }
        return result_int;
    }
}
