package SuanFa.l1962;

import java.util.Comparator;
import java.util.PriorityQueue;

public class l1962 {

    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2-o1);
        for (int p : piles) {
            pq.offer(p);
        }
        for (int i = 0;i < k;i++) {
            int num = pq.poll();
            num = (num+1)/2;
            pq.offer(num);
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}
