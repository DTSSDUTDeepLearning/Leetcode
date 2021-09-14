package SuanFa.l400;

public class l400 {

    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        long base = 10;
        n-=10;
        int i = 2;
        while (true) {
            if (n < 9*base*i) {
                int a = n / i;
                int b = n % i;
                return String.valueOf(base+a).charAt(b)-'0';
            }
            n-=9*base*i;
            i++;
            base*=10;
        }
    }
}
