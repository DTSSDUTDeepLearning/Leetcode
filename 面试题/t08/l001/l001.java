package MianShiTi.t08.l001;

import java.util.LinkedList;

public class l001 {
    public static int waysToStep(int n) {
        if (n <= 3) {
            return (int) Math.pow((double)2, (double)(n-1));
        }
        int a = 1;
        int b = 2;
        int c = 4;
        for (int i = 4;i <= n;i++) {
            int temp = ((a+b) % 1000000007 + c) % 1000000007;
            a = b;
            b = c;
            c = temp;
        }
        return c;
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 61;
        int n3 = 1000000;
        System.out.println(waysToStep(n1));
        System.out.println(waysToStep(n2));
        System.out.println(waysToStep(n3));
    }
}
