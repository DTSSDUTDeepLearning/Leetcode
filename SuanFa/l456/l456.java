package SuanFa.l456;

import java.util.Deque;
import java.util.LinkedList;

public class l456 {

    public boolean find132pattern(int[] nums) {
        int len = nums.length;
        Deque<Integer> candidateK = new LinkedList<>();
        candidateK.push(nums[len-1]);
        int maxK = Integer.MIN_VALUE;
        for (int i = len-2;i >= 0;i--) {
            if (nums[i] < maxK) {
                return true;
            }
            while (!candidateK.isEmpty() && nums[i] > candidateK.peek()) {
                maxK = candidateK.pop();
            }
            if (nums[i] > maxK) {
                candidateK.push(nums[i]);
            }
        }
        return false;
    }
}
