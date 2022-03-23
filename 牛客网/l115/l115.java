package NowCoder.l115;

import java.util.Deque;
import java.util.LinkedList;

public class l115 {

    public int[] solve (int[] a) {
        int len = a.length;
        int n = len;
        int[] result = new int[len];
        Deque<Integer> s = new LinkedList<>();
        boolean[] flag = new boolean[len+1];
        int index = 0;
        for (int i = 0;i < len;i++) {
            s.push(a[i]);
            flag[a[i]] = true;
            while (n > 0 && flag[n]) {
                n--;
            }
            while (!s.isEmpty() && n <= s.peek()) {
                result[index++] = s.pop();
            }
        }
        while (!s.isEmpty()) {
            result[index++] = s.pop();
        }
        return result;
    }
}
