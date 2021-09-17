package SuanFa.l503;

import java.util.ArrayDeque;
import java.util.Deque;

public class l503 {

    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] results = new int[len];
        if (len == 0) {
            return results;
        }
        Deque<Integer> s = new ArrayDeque<>();
        s.push(0);
        s.push(nums[0]);
        for (int i = 1;i < len;i++) {
            while (!s.isEmpty() && nums[i] > s.peek()) {
                s.poll();
                results[s.poll()] = nums[i];
            }
            s.push(i);
            s.push(nums[i]);
        }
        for (int num : nums) {
            while (!s.isEmpty() && num > s.peek()) {
                s.poll();
                results[s.poll()] = num;
            }
        }
        while (!s.isEmpty()) {
            s.poll();
            results[s.poll()] = -1;
        }
        return results;
    }
}
