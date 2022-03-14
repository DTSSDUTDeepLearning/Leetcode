package SuanFa.l1673;

import java.util.Deque;
import java.util.LinkedList;

public class l1673 {

    public int[] mostCompetitive(int[] nums, int k) {
        Deque<Integer> s = new LinkedList<>();
        s.push(0);
        int len = nums.length;
        for (int i = 1;i < len;i++) {
            while (!s.isEmpty() && nums[s.peek()] > nums[i] && len - i + s.size() > k) {
                s.poll();
            }
            if (s.size() < k) {
                s.push(i);
            }
        }
        int[] result = new int[k];
        for (int i = k-1;i >= 0;i--) {
            result[i] = s.poll();
        }
        return result;
    }
}
