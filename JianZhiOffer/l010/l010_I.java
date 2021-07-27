package JianZhiOffer.l010;

public class l010_I {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 1;
        int b = 2;
        for (int i = 2;i < n;i++) {
            int c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return a;
    }
}
