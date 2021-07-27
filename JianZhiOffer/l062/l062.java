package JianZhiOffer.l062;

public class l062 {

    public int lastRemaining(int n, int m) {
        int x = 0;
        for (int i = 2;i <= n;i++) {
            x = (m+x)%i;
        }
        return x;
    }
}
