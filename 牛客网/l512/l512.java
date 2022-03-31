package NowCoder.l512;

public class l512 {

    public int cakeNumber (int n) {
        int t = 1;
        for (int i = 1;i < n;i++) {
            t = (t + 1) * 3 / 2;
        }
        return t;
    }
}
