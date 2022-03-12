package SuanFa.l1496;

import java.util.HashSet;
import java.util.Set;

public class l1496 {

    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<Integer> s = new HashSet<>();
        s.add(0);
        for (char c : path.toCharArray()) {
            if (c == 'N') {
                x++;
            }
            else if (c == 'S') {
                x--;
            }
            else if (c == 'E') {
                y++;
            }
            else if (c == 'W') {
                y--;
            }
            if (s.contains(x*10001+y)) {
                return true;
            }
            else {
                s.add(x*10001+y);
            }
        }
        return false;
    }
}
