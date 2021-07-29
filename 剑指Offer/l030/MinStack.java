package JianZhiOffer.l030;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

    public Deque<Long> s;
    public long min;

    public MinStack() {
        s = new LinkedList<>();
        min = Long.MAX_VALUE;
    }

    public void push(int x) {
        long y = (long)x;
        if (s.isEmpty()) {
            s.push((long)0);
            min = y;
        }
        else {
            s.push(y-min);
            min = Math.min(min, y);
        }
    }

    public void pop() {
        long top = s.peek();
        if (top >= 0) {
            s.pop();
        }
        else {
            s.pop();
            min-=top;
        }
    }

    public int top() {
        long top = s.peek();
        if (top >= 0) {
            return (int)(top+min);
        }
        else {
            return (int)min;
        }
    }

    public int min() {
        return (int)min;
    }
}
