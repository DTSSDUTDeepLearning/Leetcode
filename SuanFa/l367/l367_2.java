package SuanFa.l367;

public class l367_2 {

    // 使用牛顿迭代法
    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long x = num / 2;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return (x * x == num);
    }

    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 14;
        int num3 = 2000105819;
        System.out.println(isPerfectSquare(num1));
        System.out.println(isPerfectSquare(num2));
        System.out.println(isPerfectSquare(num3));
    }
}
