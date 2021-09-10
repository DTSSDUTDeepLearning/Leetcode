package SuanFa.l233;

public class l233 {

    public int countDigitOne(int n) {
        int cnt = 0;
        for (long i = 1;i <= n;i*=10) {
            int a = (int)(n/(i*10)*i);
            int b = (int)Math.max(n%(i*10)-i+1, 0);
            b = (int)Math.min(b, i);
            cnt+=a+b;
        }
        return cnt;
    }
}
