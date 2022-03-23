package NowCoder.l132;

public class l132 {

    // 与剑指Offer第62题相同，不过最后索引处需要加1
    public int ysf (int n, int m) {
        int x = 0;
        for (int i = 2;i <= n;i++) {
            x = (m+x)%i;
        }
        return x+1;
    }
}
