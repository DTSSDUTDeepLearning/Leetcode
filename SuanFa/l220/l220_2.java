package SuanFa.l220;

import java.util.HashMap;
import java.util.Map;

public class l220_2 {

    // 使用桶
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        Map<Long, Long> map = new HashMap<>();
        long w = (long)t + 1;
        for (int i = 0; i < n; i++) {
            long id = getID(nums[i], w);
            if (map.containsKey(id)) {
                return true;
            }
            if (map.containsKey(id - 1) && Math.abs(nums[i] - map.get(id - 1)) < w) {
                return true;
            }
            if (map.containsKey(id + 1) && Math.abs(nums[i] - map.get(id + 1)) < w) {
                return true;
            }
            map.put(id, (long)nums[i]);
            if (i >= k) {
                map.remove(getID(nums[i - k], w));
            }
        }
        return false;
    }

    public long getID(long x, long w) {
        if (x >= 0) {
            return x / w;
        }
        else {
            return (x + 1) / w - 1;
        }
    }

    // 很多小伙伴对getID有点迷惑,就是为什么取负数,如w=10, 因为非负数是0~9，10~19...这种一组，而负数是-1~-10, -11~-20...这些是一组，如果-1~-10直接除以10，会被分到两组中，而不是-1这一组，所以先+1变成-0--9,与正数一致，再除以10，最后减1，正好是-1这一组，其它组也是同理

}
