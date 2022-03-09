package SuanFa.l1276;

import java.util.LinkedList;
import java.util.List;

public class l1276 {

    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> result = new LinkedList<>();
        if (tomatoSlices % 2 == 1 || tomatoSlices < 2*cheeseSlices || tomatoSlices > 4*cheeseSlices) {
            return result;
        }
        result.add((tomatoSlices-2*cheeseSlices)/2);
        result.add((4*cheeseSlices-tomatoSlices)/2);
        return result;
    }
}
