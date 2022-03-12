package SuanFa.l1486;

public class l1486 {

    public int xor(int x) {
        if (x % 4 == 0) {
            return x;
        }
        else if (x % 4 == 1) {
            return 1;
        }
        else if (x % 4 == 2) {
            return x+1;
        }
        else {
            return 0;
        }
    }

    public int xorOperation(int n, int start) {
        int s = start >> 1, e = n & start & 1;
        int ret = xor(s - 1) ^ xor(s + n - 1);
        return ret << 1 | e;
    }
}
