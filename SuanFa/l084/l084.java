package SuanFa.l084;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class l084 {

    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int[] left = new int[len];
        int[] right = new int[len];
        Arrays.fill(right, len);
        Deque<Integer> s = new LinkedList<>();
        for (int i = 0;i < len;i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                right[s.poll()] = i;
            }
            left[i] = s.isEmpty()?-1:s.peek();
            s.push(i);
        }
        int max = -1;
        for (int i = 0;i < len;i++) {
            max = Math.max(max, (right[i] - left[i] - 1) * heights[i]);
        }
        return max;
    }
}
