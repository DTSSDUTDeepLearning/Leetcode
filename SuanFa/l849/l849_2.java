package SuanFa.l849;

import java.util.Arrays;

public class l849_2 {

    // 双指针，时间O(n)，空间O(1)
//    执行用时：2 ms, 在所有 Java 提交中击败了96.10%的用户
//    内存消耗：40.7 MB, 在所有 Java 提交中击败了7.36%的用户
    public int maxDistToClosest(int[] seats) {
        int len = seats.length;
        int pre = -1;
        int fut = 0;
        int result = 0;
        for (int i = 0;i < len;i++) {
            if (seats[i] == 1) {
                pre = i;
            }
            else {
                while (fut < len && seats[fut] == 0 || fut < i) {
                    fut++;
                }
                int left = pre == -1 ? len : i - pre;
                int right = fut == len ? len : fut - i;
                result = Math.max(result, Math.min(left, right));
            }
        }
        return result;
    }
}
