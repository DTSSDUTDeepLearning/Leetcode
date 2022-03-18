package SuanFa.l1952;

public class l1952 {

    public boolean isThree(int n) {
        if (n == 1) {
            return false;
        }
        int a = (int)Math.sqrt(n);
        if (a * a != n) {
            return false;
        }
        for (int i = 2;i < a;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
