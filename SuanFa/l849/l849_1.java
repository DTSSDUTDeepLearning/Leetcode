package SuanFa.l849;

import java.util.Arrays;

public class l849_1 {

    // 时间O(n)，空间O(n)
//    执行用时：3 ms, 在所有 Java 提交中击败了26.84%的用户
//    内存消耗：39.7 MB, 在所有 Java 提交中击败了83.12%的用户
    public int maxDistToClosest(int[] seats) {
        int len = seats.length;
        int[] left = new int[len];
        int[] right = new int[len];
        Arrays.fill(left, len);
        if (seats[0] == 1) {
            left[0] = 0;
        }
        Arrays.fill(right, len);
        if (seats[len-1] == 1) {
            right[len-1] = 0;
        }
        for (int i = 1;i < len;i++) {
            if (seats[i] == 1) {
                left[i] = 0;
            }
            else {
                left[i] = left[i-1] + 1;
            }
        }
        for (int i = len-2;i >= 0;i--) {
            if (seats[i] == 1) {
                right[i] = 0;
            }
            else {
                right[i] = right[i+1] + 1;
            }
        }
        int result = 0;
        for (int i = 0;i < len;i++) {
            if (seats[i] == 0) {
                result = Math.max(result, Math.min(left[i], right[i]));
            }
        }
        return result;
    }
}
