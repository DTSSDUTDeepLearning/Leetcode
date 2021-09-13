package SuanFa.l321;

import java.util.Deque;
import java.util.LinkedList;

public class l321 {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] max_result = new int[k];
        int start = Math.max(0, k-len2);
        int end = Math.min(k, len1);
        for (int i = start;i <= end;i++) {
            int[] seq1 = removeKdigits(nums1, i);
            int[] seq2 = removeKdigits(nums2, k - i);
            int[] merge = merge(seq1, seq2);
            if (compare(max_result, 0, merge, 0) < 0) {
                max_result = merge.clone();
            }
        }
        return max_result;
    }

    // 由leetcode402改编
    public int[] removeKdigits(int[] nums, int remain) {
        int len = nums.length;
        int k = len - remain;
        Deque<Integer> s = new LinkedList<>();
        for (int num : nums) {
            while (k > 0 && !s.isEmpty() && s.peek() < num) {
                s.poll();
                k--;
            }
            s.push(num);
        }
        int[] result = new int[remain];
        LinkedList<Integer> l = new LinkedList<>();
        while (!s.isEmpty()) {
            l.addFirst(s.poll());
        }
        for (int i = 0;i < remain;i++) {
            result[i] = l.get(i);
        }
        return result;
    }

    public int[] merge(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        if (len1 == 0) {
            return nums2;
        }
        int len2 = nums2.length;
        if (len2 == 0) {
            return nums1;
        }
        int sum_len = len1 + len2;
        int[] result = new int[sum_len];
        int i = 0;
        int j = 0;
        for (int k = 0; k < sum_len; k++) {
            if (compare(nums1, i, nums2, j) > 0) {
                result[k] = nums1[i++];
            } else {
                result[k] = nums2[j++];
            }
        }
        return result;
    }

    public int compare(int[] nums1, int index1, int[] nums2, int index2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        while (index1 < len1 && index2 < len2) {
            int difference = nums1[index1] - nums2[index2];
            if (difference != 0) {
                return difference;
            }
            index1++;
            index2++;
        }
        return (len1 - index1) - (len2 - index2);
    }
}
