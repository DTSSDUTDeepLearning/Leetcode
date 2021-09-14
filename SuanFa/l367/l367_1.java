package SuanFa.l367;

public class l367_1 {

    // 使用二分查找法
    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long left = 2, right = num / 2, x, guessSquared;
        while (left <= right) {
            x = left + (right - left) / 2;
            guessSquared = x * x;
            if (guessSquared == num) {
                return true;
            }
            if (guessSquared > num) {
                right = x - 1;
            } else {
                left = x + 1;
            }
        }
        return false;
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
