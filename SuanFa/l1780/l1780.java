package SuanFa.l1780;

public class l1780 {

    public boolean checkPowersOfThree(int n) {
        while (n != 1) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
