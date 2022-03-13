package SuanFa.l1535;

public class l1535 {

    public int getWinner(int[] arr, int k) {
        int pre = Math.max(arr[0], arr[1]);
        if (k == 1) {
            return pre;
        }
        int cnt = 1;
        int max = pre;
        int len = arr.length;
        for (int i = 2;i < len;i++) {
            if (pre > arr[i]) {
                cnt++;
                if (cnt == k) {
                    return pre;
                }
            }
            else {
                pre = arr[i];
                cnt = 1;
            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
