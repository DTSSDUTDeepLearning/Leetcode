package NowCoder.l119;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class l119 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        if (k > input.length) {
            return l;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for (int x : input) {
            pq.offer(x);
        }
        for (int i = 0;i < k;i++) {
            l.add(pq.poll());
        }
        return l;
    }
}
