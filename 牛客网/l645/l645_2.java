package NowCoder.l645;

public class l645_2 {

    // 更快一些
    public int nowcoderQueue (int n, int[] a) {
        int cnt = 0;
        for(int i = 0;i < n;i++){
            a[i]-=cnt;
            if (a[i] <= 0) {
                return i+1;
            }
            cnt++;
        }
        int minCycle = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i=0; i<n; ++i){
            int tmp = a[i] / n;
            if (a[i] % n != 0) {
                tmp++;
            }
            if (tmp < minCycle) {
                minCycle = tmp;
                minIndex = i;
            }
        }
        return minIndex+1;
    }
}
