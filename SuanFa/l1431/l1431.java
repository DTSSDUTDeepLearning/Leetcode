package SuanFa.l1431;

import java.util.LinkedList;
import java.util.List;

public class l1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int num : candies) {
            max = Math.max(max, num);
        }
        List<Boolean> l = new LinkedList<>();
        for (int num : candies) {
            if (num+extraCandies >= max) {
                l.add(true);
            }
            else {
                l.add(false);
            }
        }
        return l;
    }
}
