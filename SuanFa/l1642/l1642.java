package SuanFa.l1642;

import java.util.PriorityQueue;

public class l1642 {

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int len = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int brick_sum = 0;
        for (int i = 1;i < len;i++) {
            int sub = heights[i] - heights[i-1];
            if (sub > 0) {
                pq.offer(sub);
                if (pq.size() > ladders) {
                    brick_sum+=pq.poll();
                    if (brick_sum > bricks) {
                        return i-1;
                    }
                }
            }
        }
        return len-1;
    }
}
