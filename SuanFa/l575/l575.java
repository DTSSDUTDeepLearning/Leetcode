package SuanFa.l575;

import java.util.HashSet;
import java.util.Set;

public class l575 {

    public int distributeCandies(int[] candyType) {
        Set<Integer> s = new HashSet<>();
        for (int candy : candyType) {
            s.add(candy);
        }
        return Math.min(s.size(), candyType.length/2);
    }
}
