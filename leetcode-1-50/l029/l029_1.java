package SuanFa.l029;

public class l029_1 {
    //简单的加减法，代替乘除，注意边界值
    public static int divide(int dividend, int divisor) {

        // 被除数的两种特殊情况，极小和0
        if (dividend == -2147483648) {
            if (divisor == -1) {
                return 2147483647;
            }
            else if (divisor == 1) {
                return -2147483648;
            }
        }
        if (dividend == 0) {
            return 0;
        }

        // 除数的两种特殊情况，1和-1（因为计算较慢）
        if (divisor==-1) {
            return -dividend;
        }
        if (divisor==1) {
            return dividend;
        }

        // 被除数与除数绝对值相等时
        if (dividend == divisor) {
            return 1;
        }
        if (dividend + divisor == 0) {
            return -1;
        }

        // 把商的正负号取出来
        int flag;
        if (dividend > 0 ^ divisor > 0) {
            flag = -1;
        }
        else {
            flag = 1;
        }

        if (dividend != -2147483648) {
            dividend = -Math.abs(dividend);
        }
        divisor = Math.abs(divisor);

        int shang = -1;
        while (dividend <= 0) {
            shang++;
            dividend += divisor;
        }
        return flag*shang;
    }

    public static void main(String[] args) {
        int dividend1 = 10;
        int divisor1 = 3;
        int dividend2 = 7;
        int divisor2 = -3;
        int dividend3 = -2147483648;
        int divisor3 = -1;
        int dividend4 = 5;
        int divisor4 = -1;
        int dividend5 = -2147483648;
        int divisor5 = 2;
        int dividend6 = -2147483648;
        int divisor6 = -3;
        int dividend7 = -2147483648;
        int divisor7 = -2147483648;
        System.out.println(divide(dividend1, divisor1));
        System.out.println(divide(dividend2, divisor2));
        System.out.println(divide(dividend3, divisor3));
        System.out.println(divide(dividend4, divisor4));
        System.out.println(divide(dividend5, divisor5));
        System.out.println(divide(dividend6, divisor6));
        System.out.println(divide(dividend7, divisor7));
    }
}
