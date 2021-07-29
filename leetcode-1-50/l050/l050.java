package SuanFa.l050;

public class l050 {

    // 官方题解，用位运算，减少迭代次数。注意case中有n=-2147483648，因此不能对n取相反数
    public static double myPow(double x, int n) {
        int logits = n;
        double result = 1.0000;
        while (logits != 0) {
            if (logits % 2 == 1) {
                result *= x;
            }
            x = x * x;
            logits /= 2;
        }
        return (n<0)?1.0000/result:result;
    }

    public static void main(String[] args) {
        double x1 = 2.00000;
        int n1 = 10;
        System.out.println(myPow(x1, n1));
        double x2 = 2.10000;
        int n2 = 3;
        System.out.println(myPow(x2, n2));
        double x3 = 2.00000;
        int n3 = -2;
        System.out.println(myPow(x3, n3));
        double x4 = 0.00000;
        int n4 = 2;
        System.out.println(myPow(x4, n4));
        double x5 = 6.00000;
        int n5 = 0;
        System.out.println(myPow(x5, n5));
        double x6 = 2.00000;
        int n6 = -2147483648;
        System.out.println(myPow(x6, n6));
    }
}
