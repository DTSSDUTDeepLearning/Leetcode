package NowCoder.l151;

public class l151 {

    public int gcd (int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}
