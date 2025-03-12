package l3066;

import java.util.PriorityQueue;

public class l3066 {

    public int minOperations(int[] nums, int k) {
        int cnt = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long num : nums) {
            pq.offer(num);
        }
        while (pq.peek() < k) {
            long num1 = pq.poll();
            long num2 = pq.poll();
            pq.offer(num1 + num1 + num2);
            cnt++;
        }
        return cnt;
    }
}