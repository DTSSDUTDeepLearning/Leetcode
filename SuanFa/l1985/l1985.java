package SuanFa.l1985;

import java.util.Comparator;
import java.util.PriorityQueue;

public class l1985 {

    public String kthLargestNumber(String[] nums, int k) {
        int len = nums.length;
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return compareString(o1, o2);
            }
        });
        for (int i = 0;i < k;i++) {
            pq.offer(nums[i]);
        }
        for (int i = k;i < len;i++) {
            if (compareString(pq.peek(), nums[i]) < 0) {
                pq.poll();
                pq.offer(nums[i]);
            }
        }
        return pq.peek();
    }

    public int compareString(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();
        if (len1 != len2) {
            return len1 - len2;
        }
        else {
            char[] cs1 = o1.toCharArray();
            char[] cs2 = o2.toCharArray();
            for (int i = 0;i < len1;i++) {
                if (cs1[i] != cs2[i]) {
                    return cs1[i] - cs2[i];
                }
            }
            return -1;
        }
    }
}
