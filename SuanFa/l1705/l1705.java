package SuanFa.l1705;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class l1705 {

    public static int eatenApples(int[] apples, int[] days) {
        int len = apples.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] m = new int[40001];
        int cnt = 0;
        for (int i = 0;i < len || !pq.isEmpty();i++) {
            while (!pq.isEmpty()) {
                int day = pq.peek();
                if (day <= i) {
                    pq.poll();
                }
                else {
                    break;
                }
            }
            if (i < len && apples[i] != 0) {
                int day = i + days[i];
                m[day] += apples[i];
                if (!pq.contains(day)) {
                    pq.offer(day);
                }
            }
            if (!pq.isEmpty()) {
                cnt++;
                int day = pq.poll();
                if (m[day] != 1) {
                    m[day]--;
                    pq.offer(day);
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] apples1 = new int[]{1,2,3,5,2};
        int[] days1 = new int[]{3,2,1,4,2};
        int[] apples2 = new int[]{3,0,0,0,0,2};
        int[] days2 = new int[]{3,0,0,0,0,2};
        int[] apples3 = new int[]{3,1,1,0,0,2};
        int[] days3 = new int[]{3,1,1,0,0,2};
        int[] apples4 = new int[]{2,1,10};
        int[] days4 = new int[]{2,10,1};
        System.out.println(eatenApples(apples1, days1));
        System.out.println(eatenApples(apples2, days2));
        System.out.println(eatenApples(apples3, days3));
        System.out.println(eatenApples(apples4, days4));
    }
}
