package SuanFa.l225;

import java.util.Deque;
import java.util.LinkedList;

public class MyStack {

    Deque<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        int len = q.size();
        q.offer(x);
        for (int i = 0;i < len;i++) {
            q.offer(q.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.poll();
    }

    /** Get the top element. */
    public int top() {
        return q.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}
