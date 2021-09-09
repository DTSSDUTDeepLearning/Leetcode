package SuanFa.l191;

public class l191_1 {

    // 循环检查二进制位
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                result++;
            }
        }
        return result;
    }
}
