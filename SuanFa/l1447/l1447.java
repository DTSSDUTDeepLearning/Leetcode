package SuanFa.l1447;

import java.util.LinkedList;
import java.util.List;

public class l1447 {

    public List<String> simplifiedFractions(int n) {
        List<String> result = new LinkedList<>();
        if (n == 1) {
            return result;
        }
        for (int i = 2;i <= n;i++) {
            String s = "1/"+i;
            result.add(s);
            for (int j = 2;j < i;j++) {
                int m = gcd(i, j);
                if (m == 1) {
                    s = j + "/" + i;
                    result.add(s);
                }
            }
        }
        return result;
    }

    public int gcd(int m, int n) {
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}
