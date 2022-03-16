package SuanFa.l1806;

public class l1806 {

    public int reinitializePermutation(int n) {
        if (n == 2) {
            return 1;
        }
        int k = 1;
        int pow = 2;
        while (pow != 1) {
            k++;
            pow = pow * 2 % (n - 1);
        }
        return k;
    }
}
