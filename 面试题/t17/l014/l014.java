package MianShiTi.t17.l014;

import java.util.Comparator;
import java.util.PriorityQueue;

public class l014 {

    public int[] smallestK(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int len = arr.length;
        for (int i = 0;i < k;i++) {
            pq.offer(arr[i]);
        }
        for (int i = k;i < len;i++) {
            if (pq.peek() > arr[i]) {
                pq.poll();
                pq.offer(arr[i]);
            }
        }
        int[] result = new int[k];
        for (int i = 0;i < k;i++) {
            result[i] = pq.poll();
        }
        return result;
    }
}
