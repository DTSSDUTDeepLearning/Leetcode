package NowCoder.l030;

public class l030 {

    public int minNumberdisappered (int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; ++i) {
            while (arr[i] > 0 && arr[i] <= len && arr[arr[i]-1] != arr[i]) {
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < len; ++i) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return len + 1;
    }
}
