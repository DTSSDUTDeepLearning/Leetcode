package SuanFa.l1942;

import java.util.*;

public class l1942 {

    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        int[][] arrivals = new int[n][2];
        int[][] leaves = new int[n][2];
        for (int i = 0;i < n;i++) {
            arrivals[i][0] = times[i][0];
            arrivals[i][1] = i;
            leaves[i][0] = times[i][1];
            leaves[i][1] = i;
        }
        Arrays.sort(arrivals, Comparator.comparingInt(o -> o[0]));
        Arrays.sort(leaves, Comparator.comparingInt(o -> o[0]));
        Map<Integer, Integer> m = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0;i < n;i++) {
            pq.offer(i);
        }
        int j = 0;
        for (int[] arrival : arrivals) {
            while (j < n && leaves[j][0] <= arrival[0]) {
                pq.offer(m.get(leaves[j][1]));
                j++;
            }
            if (arrival[1] == targetFriend) {
                return pq.peek();
            }
            m.put(arrival[1], pq.poll());
        }
        return -1;
    }
}
