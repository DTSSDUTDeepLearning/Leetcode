package SuanFa.l973;

import java.util.Comparator;
import java.util.PriorityQueue;

public class l973_1 {

    // 使用堆
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0]*o2[0]-o2[1]*o2[1]-o1[0]*o1[0]+o1[1]*o1[1];
            }
        });
        for (int i = 0;i < k;i++) {
            pq.offer(points[i]);
        }
        int len = points.length;
        for (int i = k;i < len;i++) {
            if (points[i][0]*points[i][0]+points[i][1]*points[i][1] < pq.peek()[0]*pq.peek()[0]-pq.peek()[1]*pq.peek()[1]) {
                pq.poll();
                pq.offer(points[i]);
            }
        }
        int[][] results = new int[k][2];
        for (int i = 0;i < k;i++) {
            results[i] = pq.poll();
        }
        return results;
    }
}
