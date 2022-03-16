package SuanFa.l1846;

import java.util.Arrays;

public class l1846 {

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        arr[0] = 1;
        for (int i = 1;i < len;i++) {
            if (arr[i-1] < arr[i] - 1) {
                arr[i] = arr[i-1] + 1;
            }
        }
        return arr[len-1];
    }
}
