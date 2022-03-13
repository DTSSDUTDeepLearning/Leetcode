package SuanFa.l1502;

import java.util.Arrays;

public class l1502 {

    // 常规做法，排序后判断公差
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int sub = arr[1] - arr[0];
        int len = arr.length;
        for (int i = 2;i < len;i++) {
            if (sub != arr[i] - arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}
