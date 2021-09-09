package SuanFa.l191;

public class l191_2 {

    // 位运算优化，n & (n−1)把n的二进制位中的最低位的1变为0
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            n &= n - 1;
            result++;
        }
        return result;
    }
}
