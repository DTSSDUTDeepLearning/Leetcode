package SuanFa.l693;

public class l692 {

    public static boolean hasAlternatingBits(int n) {
        int x = n % 2;
        n /= 2;
        while (n > 0) {
            if (x != n % 2) {
                x = n % 2;
                n /= 2;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;
        int n3 = 11;
        int n4 = 10;
        int n5 = 3;
        int n6 = 1;
        int n7 = (int)(Math.pow(2, 31)-1);
//        System.out.println(n7);
        System.out.println(hasAlternatingBits(n1));
        System.out.println(hasAlternatingBits(n2));
        System.out.println(hasAlternatingBits(n3));
        System.out.println(hasAlternatingBits(n4));
        System.out.println(hasAlternatingBits(n5));
        System.out.println(hasAlternatingBits(n6));
        System.out.println(hasAlternatingBits(n7));
    }
}
