package NowCoder.l090;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class l090 {

    public int[] getMinStack (int[][] op) {
        Deque<Integer> s = new LinkedList<>();
        List<Integer> l = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        for (int[] o : op) {
            if (o[0] == 1) {
                if (s.isEmpty()) {
                    s.push(0);
                    min = o[1];
                }
                else {
                    s.push(o[1]-min);
                    min = Math.min(min, o[1]);
                }
            }
            else if (o[0] == 2) {
                int top = s.peek();
                if (top >= 0) {
                    s.pop();
                }
                else {
                    s.pop();
                    min-=top;
                }
            }
            else {
                l.add(min);
            }
        }
        int len = l.size();
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}
