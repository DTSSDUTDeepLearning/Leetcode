package SuanFa.l1306;

import java.util.Deque;
import java.util.LinkedList;

public class l1306 {

    public boolean canReach(int[] arr, int start) {
        if (arr[start] == 0) {
            return true;
        }
        int len = arr.length;
        boolean[] flag = new boolean[len];
        flag[start] = true;
        Deque<Integer> q = new LinkedList<>();
        q.offer(start);
        while (!q.isEmpty()) {
            start = q.pop();
            int tmp = start+arr[start];
            if (tmp < len && !flag[tmp]) {
                if (arr[tmp] == 0) {
                    return true;
                }
                flag[tmp] = true;
                q.offer(tmp);
            }
            tmp = start-arr[start];
            if (tmp >= 0 && !flag[tmp]) {
                if (arr[tmp] == 0) {
                    return true;
                }
                flag[tmp] = true;
                q.offer(tmp);
            }
        }
        return false;
    }
}
