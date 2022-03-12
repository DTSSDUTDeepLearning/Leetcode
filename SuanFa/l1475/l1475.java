package SuanFa.l1475;

import java.util.Deque;
import java.util.LinkedList;

public class l1475 {

    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] result = new int[len];
        Deque<Integer> s = new LinkedList<>();
        for (int i = 0;i < len;i++) {
            while (!s.isEmpty() && prices[s.peek()] >= prices[i]) {
                result[s.pop()] = prices[i];
            }
            s.push(i);
        }
        for (int i = 0;i < len;i++) {
            result[i] = prices[i]-result[i];
        }
        return result;
    }
}
