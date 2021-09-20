package SuanFa.l682;

import java.util.ArrayDeque;
import java.util.Deque;

public class l682 {

    public int calPoints(String[] ops) {
        int len = ops.length;
        Deque<Integer> s = new ArrayDeque<>();
        int sum = 0;
        for (int i = 0;i < len;i++) {
            String op = ops[i];
            if (op.equals("+")) {
                int last = s.poll();
                int lastlast = s.peek();
                sum+=(last+lastlast);
                s.push(last);
                s.push(last+lastlast);
            }
            else if (op.equals("D")) {
                int last = s.peek();
                sum+=(last*2);
                s.push(last*2);
            }
            else if (op.equals("C")) {
                sum-=s.poll();
            }
            else {
                int value = Integer.valueOf(op);
                sum+=value;
                s.push(value);
            }
        }
        return sum;
    }
}
