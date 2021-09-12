package SuanFa.l263;

public class l263 {

    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return (num == 1)?true:false;
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 8;
        int num3 = 14;
        System.out.println(isUgly(num1));
        System.out.println(isUgly(num2));
        System.out.println(isUgly(num3));
    }
}
