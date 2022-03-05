package SuanFa.l970;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class l970 {

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0;i < 20 && Math.pow(x, i) <= bound;i++)
            for (int j = 0;j < 20 && Math.pow(y, j) <= bound;j++) {
                int v = (int)Math.pow(x, i) + (int)Math.pow(y, j);
                if (v <= bound)
                    s.add(v);
            }
        return new ArrayList<>(s);
    }
}
