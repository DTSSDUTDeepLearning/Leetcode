package SuanFa.l202;

public class l202 {

    public static int doHappy(int n) {
        int total = 0;
        while (n > 0) {
            total += Math.pow(n%10, 2);
            n /= 10;
        }
        return total;
    }

    public static boolean isHappy(int n) {
        int tortoise = n;
        int rabbit = doHappy(n);
        while (tortoise != rabbit && tortoise != 1) {
            tortoise = doHappy(tortoise);
            rabbit = doHappy(doHappy(rabbit));
        }
        if (tortoise == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 7;
        int n3 = 19;
        System.out.println(isHappy(n1));
        System.out.println(isHappy(n2));
        System.out.println(isHappy(n3));
    }
}
