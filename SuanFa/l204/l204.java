package SuanFa.l204;

public class l204 {

    public int countPrimes(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        boolean[] shaizi = new boolean[n+1];
        shaizi[0] = shaizi[1] = false;
        for (int i = 2;i <= n;i++) {
            shaizi[i] = true;
        }
        for (int i = 2;i <= Math.sqrt(n);i++) {
            if (shaizi[i]) {
                int heshu = i+i;
                while (heshu <= n) {
                    shaizi[heshu] = false;
                    heshu += i;
                }
            }
        }
        int number = 0;
        for (int i = 2;i < n;i++) {
            if (shaizi[i]) {
                number++;
            }
        }
        return number;
    }
}
