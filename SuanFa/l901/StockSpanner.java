package l901;

import java.util.Deque;
import java.util.LinkedList;

public class StockSpanner {

    Deque<int[]> stack;
    int num;

    public StockSpanner() {
        stack = new LinkedList<>();
        num = 0;
    }

    public int next(int price) {
        num = 1;
        if (!(stack.isEmpty() || price < stack.peek()[0])) {
            while (!stack.isEmpty() && price >= stack.peek()[0]) {
                num+=stack.peek()[1];
                stack.poll();
            }
        }
        stack.push(new int[]{price, num});
        return num;
    }
}
