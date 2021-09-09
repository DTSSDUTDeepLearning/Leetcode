package SuanFa.l172;

import java.math.BigInteger;

public class l172 {

    public static int trailingZeroes(int n) {
        int cnt = 0;
        while (n >= 5) {
            n /= 5;
            cnt += n;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;
        int n3 = 10;
        int n4 = 100;
        int n5 = 21;
        int n6 = 51;
        int n7 = 56;
        int n8 = 101;
        int n9 = 15;
        System.out.println(trailingZeroes(n1));
        System.out.println(trailingZeroes(n2));
        System.out.println(trailingZeroes(n3));
        System.out.println(trailingZeroes(n4));
        System.out.println(trailingZeroes(n5));
        System.out.println(trailingZeroes(n6));
        System.out.println(trailingZeroes(n7));
        System.out.println(trailingZeroes(n8));
        System.out.println(trailingZeroes(n9));
    }
}
