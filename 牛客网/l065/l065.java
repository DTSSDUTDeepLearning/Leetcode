package NowCoder.l065;

public class l065 {

    public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 3;i <= n;i++) {
            a = b;
            b = c;
            c = a+b;
        }
        return c;
    }
}
