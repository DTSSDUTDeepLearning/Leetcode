package SuanFa.l461;

public class l461 {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int cnt = 0;
        while (xor != 0) {
            if (xor % 2 != 0) {
                cnt++;
            }
            xor>>=1;
        }
        return cnt;
    }
}
