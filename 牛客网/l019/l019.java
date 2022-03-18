package NowCoder.l019;

public class l019 {

    public int maxsumofSubarray (int[] arr) {
        int len = arr.length;
        int max = arr[0];
        for (int i = 1;i < len;i++) {
            if (arr[i-1] > 0) {
                arr[i]+=arr[i-1];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
