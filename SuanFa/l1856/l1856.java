package SuanFa.l1856;

import java.util.Deque;
import java.util.LinkedList;

public class l1856 {

    public int maxSumMinProduct(int[] nums) {
        // 参考官方题解，单调栈中的下标是+1的，前缀和的下标也是+1的
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        Deque<Integer> s = new LinkedList<>();
        for (int i = 0;i < len;i++) {
            right[i] = len - 1;
            while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
                right[s.peek()] = i - 1;
                s.pop();
            }
            if (!s.isEmpty()) {
                left[i] = s.peek() + 1;
            }
            s.push(i);
        }
        int[] pre = new int[len+1];
        for (int i = 1;i <= len;i++) {
            pre[i] = pre[i-1] + nums[i-1];
        }
        long max = 0;
        for (int i = 0;i < len;i++) {
            max = Math.max(max, (long)(pre[right[i]+1] - pre[left[i]]) * nums[i]);
        }
        return (int)(max % 1000000007);
    }
}
