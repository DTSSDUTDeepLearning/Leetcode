package SuanFa.l442;

import java.util.LinkedList;
import java.util.List;

public class l442 {

    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        for (int num : nums) {
            nums[(num - 1) % len] = nums[(num - 1) % len] + len;
        }
        List<Integer> result = new LinkedList<>();
        for (int num : nums) {
            if (num > 2 * len) {
                result.add(num % len);
            }
        }
        return result;
    }
}
