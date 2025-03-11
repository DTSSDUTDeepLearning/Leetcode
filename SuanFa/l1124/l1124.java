package l1124;

import java.util.ArrayDeque;
import java.util.Deque;

public class l1124 {

    public int longestWPI(int[] hours) {
        int len = hours.length;
        int[] s = new int[len+1];
        s[0] = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for (int i = 1;i <= len;i++) {
            s[i] = s[i-1] + (hours[i-1]>8?1:-1);
            if (s[stack.peek()] > s[i]) {
                stack.push(i);
            }
        }
        int result = 0;
        for (int r = len;r > 0;r--) {
            while (!stack.isEmpty() && s[stack.peek()] < s[r]) {
                result = Math.max(result, r - stack.pop());
            }
        }
        return result;
    }
}
