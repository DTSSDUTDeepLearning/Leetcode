package SuanFa.l1287;

public class l1287 {

    public int findSpecialInteger(int[] arr) {
        int cnt = 1;
        int len = arr.length;
        int n = arr[0];
        for (int i = 1;i < len;i++) {
            if (n == arr[i]) {
                cnt++;
                if (cnt*4 > len) {
                    return n;
                }
            }
            else {
                cnt = 1;
                n = arr[i];
            }
        }
        return n;
    }
}
