package SuanFa.l1389;

import java.util.LinkedList;
import java.util.List;

public class l1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> l = new LinkedList<>();
        int len = nums.length;
        for (int i = 0;i < len;i++) {
            l.add(index[i], nums[i]);
        }
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}
