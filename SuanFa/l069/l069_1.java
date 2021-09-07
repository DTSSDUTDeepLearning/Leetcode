package SuanFa.l069;

public class l069_1 {

    // 顺序遍历
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int i = 1;
        while (x / i >= i) {
            i++;
        }
        return --i;
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
