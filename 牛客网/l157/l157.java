package NowCoder.l157;

import java.util.Deque;
import java.util.LinkedList;

public class l157 {

    public int[][] foundMonotoneStack (int[] nums) {
        int len = nums.length;
        int[][] result = new int[len][2];
        for (int i = 0;i < len;i++) {
            result[i][1] = -1;
        }
        Deque<Integer> s = new LinkedList<>();
        for (int i = 0;i < len;i++) {
            while (!s.isEmpty() && nums[s.peek()] > nums[i]) {
                result[s.poll()][1] = i;
            }
            result[i][0] = !s.isEmpty() ? s.peek() : -1;
            s.push(i);
        }
        return result;
    }
}
