package SuanFa.l042;

import java.util.Deque;
import java.util.LinkedList;

public class l042_2 {

    // 使用单调栈，栈中存储从左到右遍历的满足条件的下标
    // 2ms, 38.2MB
    public int trap(int[] height) {
        int len = height.length;
        if (len == 0) {
            return 0;
        }
        Deque<Integer> s = new LinkedList<>();
        int start = 0;
        while (start < len && height[start]==0) {
            start++;
        }
        int water = 0;
        for (int i = start;i < len;i++) {
            while (!s.isEmpty() && height[i] > height[s.peek()]) {
                int before = s.pop();
                if (!s.isEmpty()) {
                    int last = s.peek();
                    water+= (Math.min(height[last], height[i])-height[before])*(i-last-1);
                }
            }
            s.push(i);
        }
        return water;
    }
}
