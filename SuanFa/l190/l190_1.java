package SuanFa.l190;

public class l190_1 {

    // 逐位翻转颠倒
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0;i < 32 && n != 0;i++) {
            result |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return result;
    }
}
