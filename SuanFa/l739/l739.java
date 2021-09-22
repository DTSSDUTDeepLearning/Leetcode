package SuanFa.l739;

import java.util.ArrayDeque;
import java.util.Deque;

public class l739 {

    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] result = new int[len];
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = 0;i < len;i++) {
            int t = T[i];
            while (!s.isEmpty() && t > T[s.peek()]) {
                int prev_index = s.pop();
                result[prev_index] = i - prev_index;
            }
            s.push(i);
        }
        return result;
    }
}
