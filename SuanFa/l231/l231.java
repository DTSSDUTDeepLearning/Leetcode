package SuanFa.l231;

public class l231 {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        long x = (long) n;
        return (x & (-x)) == x;
    }

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 16;
        int n3 = 218;
        System.out.println(isPowerOfTwo(n1));
        System.out.println(isPowerOfTwo(n2));
        System.out.println(isPowerOfTwo(n3));
    }
}
