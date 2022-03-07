package MianShiTi.t03.l004;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {

    Deque<Integer> s1;
    Deque<Integer> s2;

    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new LinkedList<>();
        s2 = new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                return -1;
            }
            else {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                return s2.pop();
            }
        }
        else {
            return s2.pop();
        }
    }

    /** Get the front element. */
    public int peek() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                return -1;
            }
            else {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                return s2.peek();
            }
        }
        else {
            return s2.peek();
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
