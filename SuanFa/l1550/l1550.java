package SuanFa.l1550;

public class l1550 {

    public boolean threeConsecutiveOdds(int[] arr) {
        int cnt = 0;
        for (int n : arr) {
            if (n % 2 == 1) {
                if (cnt == 2) {
                    return true;
                }
                cnt++;
            }
            else {
                cnt = 0;
            }
        }
        return false;
    }
}
