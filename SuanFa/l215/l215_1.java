package SuanFa.l215;

import java.util.Comparator;
import java.util.PriorityQueue;

public class l215_1 {

    // 堆排序
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0;i < k;i++) {
            pq.offer(nums[i]);
        }
        int len = nums.length;
        for (int i = k;i < len;i++) {
            if (pq.peek() < nums[i]) {
                pq.poll();
                pq.offer(nums[i]);
            }
        }
        return pq.peek();
    }
}
