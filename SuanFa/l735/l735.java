package SuanFa.l728;

import java.util.ArrayDeque;
import java.util.Deque;

public class l735 {

    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> s = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            if (s.isEmpty() || asteroid > 0 || s.peek() < 0) {
                s.push(asteroid);
            }
            else {
                while (asteroid < 0 && !s.isEmpty() && s.peek() > 0) {
                    int prev = s.pop();
                    int after_col = prev+asteroid;
                    if (after_col == 0) {
                        asteroid = 0;
                        break;
                    }
                    else if (after_col > 0) {
                        asteroid = 0;
                        s.push(prev);
                        break;
                    }
                }
                if (asteroid < 0) {
                    s.push(asteroid);
                }
            }
        }
        int len = s.size();
        int[] result = new int[len];
        for (int i = len-1;i >= 0;i--) {
            result[i] = s.pop();
        }
        return result;
    }
}
