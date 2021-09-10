package SuanFa.l239;

import java.util.Deque;
import java.util.LinkedList;

public class l239 {

    // 取一个双端队列，里面存放数组的index。由于index有序存放，因此该队列为单调队列。
    // 原理：对于两个索引i,j, i<j, 如果nums[i]<nums[j],那么只要j未被从队列中删除，永远轮不到i成为老大。所以当j存进队列时，可以清算它之前的那些比它小的元素的索引。
    // 这样一来，较大的元素索引永远是在最前面保存的。而且根据窗口的滑动，判断最前面元素是否要被删除。
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        Deque<Integer> d = new LinkedList<>();
        for (int i = 0;i < k;i++) {
            while (!d.isEmpty() && nums[d.peekLast()] < nums[i]) {
                d.pollLast();
            }
            d.offerLast(i);
        }

        int[] result = new int[len-k+1];
        result[0] = nums[d.peekFirst()];
        for (int i = k;i < len;i++) {
            while (!d.isEmpty() && nums[d.peekLast()] < nums[i]) {
                d.pollLast();
            }
            d.offerLast(i);
            if (d.peekFirst() <= i-k) {
                d.pollFirst();
            }
            result[i-k+1] = nums[d.peekFirst()];
        }
        return result;
    }

}
