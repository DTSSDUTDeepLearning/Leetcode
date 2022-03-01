package SuanFa.l845;

public class l845_1 {

    // 枚举山顶
    public int longestMountain(int[] arr) {
        int len = arr.length;
        if (len < 3) {
            return 0;
        }
        int[] left = new int[len];
        left[0] = 0;
        for (int i = 1;i < len;i++) {
            if (arr[i-1] < arr[i]) {
                left[i] = left[i-1] + 1;
            }
            else {
                left[i] = 0;
            }
        }
        int[] right = new int[len];
        right[len-1] = 0;
        for (int i = len-2;i >= 0;i--) {
            if (arr[i+1] < arr[i]) {
                right[i] = right[i+1] + 1;
            }
            else {
                right[i] = 0;
            }
        }
        int max = 0;
        for (int i = 1;i < len-1;i++) {
            if (left[i] != 0 && right[i] != 0) {
                max = Math.max(max, left[i] + right[i] + 1);
            }
        }
        return max;
    }
}
