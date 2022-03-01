package SuanFa.l845;

public class l845_2 {

    // 枚举山脚
    public int longestMountain(int[] arr) {
        int len = arr.length;
        if (len < 3) {
            return 0;
        }
        int left = 0;
        int max = 0;
        while (left < len-2) {
            int right = left + 1;
            if (arr[left] < arr[left+1]) {
                while (right < len-1 && arr[right] < arr[right+1]) {
                    right++;
                }
                if (right < len-1 && arr[right] > arr[right+1]) {
                    while (right < len-1 && arr[right] > arr[right+1]) {
                        right++;
                    }
                    max = Math.max(max, right - left + 1);
                }
                else {
                    right++;
                }
            }
            left = right;
        }
        return max;
    }
}
