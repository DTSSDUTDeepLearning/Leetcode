package l2357;

import java.util.HashSet;
import java.util.Set;

public class l2357 {

    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        set.remove(0);
        return set.size();
    }
}
