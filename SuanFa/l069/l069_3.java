package SuanFa.l069;

public class l069_3 {

    // 牛顿法，f(i)=i^2-x，找到零点在i和i+1之间。导数函数为f'(i)=2*i
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        double C = x, x0 = x;
        while (true) {
            double xi = 0.5 * (x0 + C / x0);
            if (Math.abs(x0 - xi) < 1e-7) {
                break;
            }
            x0 = xi;
        }
        return (int) x0;
    }

    public static void main(String[] args) {
        int x1 = 4;
        int x2 = 8;
        int x3 = 2147395600;
        System.out.println(mySqrt(x1));
        System.out.println(mySqrt(x2));
        System.out.println(mySqrt(x3));
    }
}
