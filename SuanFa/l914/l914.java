package SuanFa.l914;

import java.util.HashMap;
import java.util.Map;

public class l914 {

    public boolean hasGroupsSizeX(int[] deck) {
        int len = deck.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : deck) {
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        int X = m.get(deck[0]);
        for (int X_cnt : m.values()) {
            X = gcd(X, X_cnt);
        }
        if (X < 2) {
            return false;
        }
        for (int i = 1;i < len;i++) {
            if (m.get(deck[i]) % X != 0) {
                return false;
            }
        }
        return true;
    }

    public int gcd(int x, int y) {
        if (x < y) {
            return gcd(y, x);
        }
        int r;
        while (x % y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        return y;
    }
}
