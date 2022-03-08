package SuanFa.l1137;

public class l1137 {

    public int tribonacci(int n) {
        if (n <= 2) {
            return (n+1)/2;
        }
        int a = 1;
        int b = 1;
        int c = 2;
        for (int i = 3;i < n;i++) {
            int tmp = a+b+c;
            a = b;
            b = c;
            c = tmp;
        }
        return c;
    }
}
