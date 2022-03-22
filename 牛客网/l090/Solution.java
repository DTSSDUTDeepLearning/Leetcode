package NowCoder.l090;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    Deque<Long> s = new LinkedList<>();
    long min = Long.MAX_VALUE;

    public void push(int node) {
        if (s.isEmpty()) {
            s.push((long)0);
            min = (long)node;
        }
        else {
            s.push((long)node - min);
            min = Math.min(min, (long)node);
        }
    }

    public void pop() {
        long top = s.peek();
        if (top >= 0) {
            s.pop();
        }
        else {
            s.pop();
            min -= top;
        }
    }

    public int top() {
        long top = s.peek();
        if (top >= 0) {
            return (int)(top + min);
        }
        else {
            return (int)min;
        }
    }

    public int min() {
        return (int)min;
    }
}
