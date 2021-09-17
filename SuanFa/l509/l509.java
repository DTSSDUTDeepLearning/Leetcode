package SuanFa.l509;

public class l509 {

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 2;i <= n;i++) {
            int tmp = b;
            b = a + b;
            a = tmp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 5;
        int n3 = 18;
        int n4 = 20;
        int n5 = 30;
        System.out.println(fib(n1));
        System.out.println(fib(n2));
        System.out.println(fib(n3));
        System.out.println(fib(n4));
        System.out.println(fib(n5));
    }
}
