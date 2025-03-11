package l874;

import java.util.HashSet;
import java.util.Set;

public class l874 {

    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] dir = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        int x = 0;
        int y = 0;
        int index = 0;
        Set<Integer> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(positionToInteger(obstacle[0], obstacle[1]));
        }

        int result = 0;
        for (int command : commands) {
            if (command == -2) {
                index = (index + 1) % 4;
            }
            else if (command == -1) {
                index = (index + 3) % 4;
            }
            else {
                for (int i = 0;i < command;i++) {
                    int dx = x + dir[index][0];
                    int dy = y + dir[index][1];
                    if (!obstacleSet.contains(positionToInteger(dx, dy))) {
                        x = dx;
                        y = dy;
                        result = Math.max(result, x*x+y*y);
                    }
                }
            }
        }
        return result;
    }

    public int positionToInteger(int x, int y) {
        return (x + 30000) * 30000 + (y + 30000);
    }
}
