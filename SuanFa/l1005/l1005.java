package SuanFa.l1005;

import java.util.PriorityQueue;

public class l1005 {

    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer> positive = new PriorityQueue<>();
        PriorityQueue<Integer> negative = new PriorityQueue<>();
        int negative_max = Integer.MIN_VALUE;
        boolean flag = false;
        int sum = 0;
        for (int num : A) {
            if (num > 0) {
                positive.offer(num);
                sum += num;
            }
            else if (num < 0) {
                negative.offer(num);
                sum += num;
                negative_max = Math.max(negative_max, num);
            }
            else {
                flag = true;
            }
        }
        int negative_len = negative.size();
        if (flag) {
            int min = Math.min(K, negative_len);
            for (int i = 0;i < min;i++) {
                sum-=2*negative.poll();
            }
        }
        else if (negative_len == 0) {
            if (K % 2 != 0) {
                sum-=2*(positive.peek());
            }
        }
        else if (K <= negative_len) {
            int min = Math.min(K, negative_len);
            for (int i = 0;i < min;i++) {
                sum-=2*negative.poll();
            }
        }
        else {
            for (int num : negative) {
                positive.offer(-num);
                sum-=2*num;
            }
            int min;
            if (positive.isEmpty()) {
                min = -negative_max;
            }
            else {
                min = Math.min(-negative_max, positive.peek());
            }
            if ((K-negative_len) % 2 != 0) {
                sum-=2*min;
            }
        }
        return sum;
    }
}
