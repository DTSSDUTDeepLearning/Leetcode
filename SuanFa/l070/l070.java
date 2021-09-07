package SuanFa.l070;

public class l070 {

    public static int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int a = 2;
        int b = 3;
        for (int i = 3;i < n;i++) {
            int c = a+b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;
        System.out.println(climbStairs(n1));
        System.out.println(climbStairs(n2));
    }
}
