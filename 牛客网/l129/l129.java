package NowCoder.l129;

public class l129 {

    public long thenumberof0 (long n) {
        if (n < 5) {
            return 0;
        }
        return n/5+thenumberof0(n/5);
    }
}
