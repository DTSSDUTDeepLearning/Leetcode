package SuanFa.l390;

public class l390 {

    public static int lastRemaining(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return 2*(n/2+1-lastRemaining(n/2));
        }
    }

    public static void main(String[] args) {
        int n1 = 9;
        System.out.println(lastRemaining(n1));
    }
}
