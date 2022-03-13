package SuanFa.l1509;

import java.util.Comparator;
import java.util.PriorityQueue;

public class l1509 {

    public int minDifference(int[] nums) {
        int len = nums.length;
        if (len < 4) {
            return 0;
        }
        PriorityQueue<Integer> bigpq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        PriorityQueue<Integer> smallpq = new PriorityQueue<>();
        for (int i = 0;i < 4;i++) {
            int n = nums[i];
            bigpq.offer(n);
            smallpq.offer(n);
        }
        for (int i = 4;i < len;i++) {
            int n = nums[i];
            if (n < bigpq.peek()) {
                bigpq.poll();
                bigpq.offer(n);
            }
            if (n > smallpq.peek()) {
                smallpq.poll();
                smallpq.offer(n);
            }
        }
        int[] max = new int[4];
        int[] min = new int[4];
        for (int i = 3;i >= 0;i--) {
            min[i] = bigpq.poll();
            max[i] = smallpq.poll();
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0;i < 4;i++) {
            result = Math.min(result, max[i]-min[3-i]);
        }
        return result;
    }
}
