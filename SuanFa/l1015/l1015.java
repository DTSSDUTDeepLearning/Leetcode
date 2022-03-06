package SuanFa.l1015;

public class l1015 {

    public int smallestRepunitDivByK(int K) {
        if (K % 2 == 0 || K % 5 == 0) {
            return -1;
        }
        int result = 1;
        int len = 1;
        while (result % K != 0) {
            result %= K;
            result = result*10+1;
            len++;
        }
        return len;
    }
}
