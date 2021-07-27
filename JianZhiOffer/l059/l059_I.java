package JianZhiOffer.l059;

import java.util.Deque;
import java.util.LinkedList;

public class l059_I {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new LinkedList<>();
        int len = nums.length;
        for (int i = 0;i < k;i++) {
            while (!q.isEmpty() && nums[i] > nums[q.peekLast()]) {
                q.pollLast();
            }
            q.offerLast(i);
        }
        int[] result = new int[len-k+1];
        result[0] = nums[q.peekFirst()];
        for (int i = k;i < len;i++) {
            while (!q.isEmpty() && nums[i] > nums[q.peekLast()]) {
                q.pollLast();
            }
            q.offerLast(i);
            if (q.peekFirst() <= i-k) {
                q.pollFirst();
            }
            result[i-k+1] = nums[q.peekFirst()];
        }
        return result;
    }
}
