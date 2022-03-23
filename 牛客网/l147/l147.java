package NowCoder.l147;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class l147 {

    public int minmumNumberOfHost (int n, int[][] startEnd) {
        Arrays.sort(startEnd, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0];
            }
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(Integer.MIN_VALUE);
        for (int[] t : startEnd) {
            if (pq.peek() <= t[0]) {
                pq.poll();
            }
            pq.offer(t[1]);
        }
        return pq.size();
    }
}
