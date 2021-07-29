package JianZhiOffer.l041;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> small;
    PriorityQueue<Integer> big;
    int k = 0;

    public MedianFinder() {
        small = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        big = new PriorityQueue<>();
    }

    public void addNum(int num) {
        k++;
        if (k == 1) {
            small.offer(num);
        }
        else {
            if (k % 2 == 0) {
                if (num >= small.peek()) {
                    big.offer(num);
                }
                else {
                    big.offer(small.poll());
                    small.offer(num);
                }
            }
            else if (num <= big.peek()) {
                small.offer(num);
            }
            else {
                small.offer(big.poll());
                big.offer(num);
            }
        }
    }

    public double findMedian() {
        if (k % 2 == 0) {
            return ((double)small.peek()+(double)big.peek())/2;
        }
        else {
            return (double)small.peek();
        }
    }
}
