package NowCoder.l645;

public class l645_1 {

    // 暴力法，时间复杂度很高
    public int nowcoderQueue (int n, int[] a) {
        while (true) {
            for (int i = 0;i < n;i++) {
                if (a[i]-i > 0) {
                    a[i]-=n;
                }
                else {
                    return i+1;
                }
            }
        }
    }
}
