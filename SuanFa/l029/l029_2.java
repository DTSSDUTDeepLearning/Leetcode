package SuanFa.l029;

public class l029_2 {
    //用位运算代替乘2运算，在此基础上，加速加减法
    public static int divide(int dividend, int divisor) {
        if (dividend == -2147483648 && divisor == -1) {
            return 2147483647;
        }

        int flag = (dividend > 0 ^ divisor > 0)?-1:1;

        if (dividend > 0) {
            dividend = -dividend;
        }
        if (divisor > 0) {
            divisor = -divisor;
        }

        int shang = 0;
        while (dividend <= divisor) {
            int tmp = divisor;
            int c = 1;
            while (dividend - tmp < tmp) {
                tmp = tmp + tmp;
                c = c + c;
            }
            dividend -= tmp;
            shang += c;
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
