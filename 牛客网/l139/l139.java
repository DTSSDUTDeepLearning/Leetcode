package NowCoder.l139;

public class l139 {

    public int LastRemaining_Solution(int n, int m) {
        if (n == 0 || m == 0) {
            return -1;
        }
        int x = 0;
        for (int i = 2;i <= n;i++) {
            x = (m+x)%i;
        }
        return x;
    }
}
