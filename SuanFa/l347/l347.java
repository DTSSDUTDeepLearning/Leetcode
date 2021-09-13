package SuanFa.l347;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class l347 {

    public int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0;i < len;i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<int[]> p = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int num = entry.getKey();
            int cnt = entry.getValue();
            if (p.size() == k) {
                if (p.peek()[1] < cnt) {
                    p.poll();
                    p.offer(new int[]{num, cnt});
                }
            }
            else {
                p.offer(new int[]{num, cnt});
            }
        }
        int[] result = new int[k];
        for (int i = 0;i < k;i++) {
            result[i] = p.poll()[0];
        }
        return result;
    }
}
