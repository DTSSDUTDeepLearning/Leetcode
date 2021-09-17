package SuanFa.l506;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class l506 {

    public String[] findRelativeRanks(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return new String[]{"Gold Medal"};
        }
        if (len == 2) {
            if (nums[0] > nums[1]) {
                return new String[]{"Gold Medal", "Silver Medal"};
            }
            else {
                return new String[]{"Silver Medal", "Gold Medal"};
            }
        }

        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(1) - o1.get(1);
            }
        });

        for (int i = 0;i < len;i++) {
            List<Integer> l = new LinkedList<>();
            l.add(i);
            l.add(nums[i]);
            pq.offer(l);
        }
        String[] results = new String[len];
        String[] medal = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int i = 0;i < 3;i++) {
            List<Integer> l = pq.poll();
            results[l.get(0)] = medal[i];
        }
        int m = 4;
        while (!pq.isEmpty()) {
            List<Integer> l = pq.poll();
            results[l.get(0)] = m+"";
            m++;
        }
        return results;
    }
}
