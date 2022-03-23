package NowCoder.l131;

import java.util.*;

public class l131 {

    public double[] flowmedian (int[][] operations) {
        PriorityQueue<Integer> small = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        PriorityQueue<Integer> big = new PriorityQueue<>();
        List<Double> l = new LinkedList<>();
        int k = 0;
        for (int[] o : operations) {
            if (o[0] == 1) {
                k++;
                if (k == 1) {
                    small.offer(o[1]);
                }
                else {
                    if (k % 2 == 0) {
                        if (o[1] >= small.peek()) {
                            big.offer(o[1]);
                        }
                        else {
                            big.offer(small.poll());
                            small.offer(o[1]);
                        }
                    }
                    else if (o[1] <= big.peek()) {
                        small.offer(o[1]);
                    }
                    else {
                        small.offer(big.poll());
                        big.offer(o[1]);
                    }
                }
            }
            else {
                if (k == 0) {
                    l.add(-1.0);
                }
                else if (k % 2 == 0) {
                    l.add(((double)small.peek()+(double)big.peek())/2);
                }
                else {
                    l.add((double)small.peek());
                }
            }
        }
        int len = l.size();
        double[] result = new double[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}
