package SuanFa.l1217;

public class l1217 {

    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for (int num : position) {
            if (num % 2 == 1) {
                odd++;
            }
            else {
                even++;
            }
        }
        return Math.min(odd, even);
    }
}
