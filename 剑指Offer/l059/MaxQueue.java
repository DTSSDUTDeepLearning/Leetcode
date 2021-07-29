package JianZhiOffer.l059;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {

    Queue<Integer> q;
    Deque<Integer> bi_q;

    public MaxQueue() {
        q = new LinkedList<>();
        bi_q = new LinkedList<>();
    }

    public int max_value() {
        if (bi_q.isEmpty()) {
            return -1;
        }
        else {
            return bi_q.peekFirst();
        }
    }

    public void push_back(int value) {
        while (!bi_q.isEmpty() && bi_q.peekLast() < value) {
            bi_q.pollLast();
        }
        bi_q.offerLast(value);
        q.offer(value);
    }

    public int pop_front() {
        if (q.isEmpty()) {
            return -1;
        }
        else {
            int value = q.poll();
            if (value == bi_q.peekFirst()) {
                bi_q.pollFirst();
            }
            return value;
        }
    }
}
