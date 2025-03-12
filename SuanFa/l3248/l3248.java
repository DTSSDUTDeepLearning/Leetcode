package l3248;

import java.util.List;

public class l3248 {

    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        for (String command : commands) {
            switch (command) {
                case "UP":
                    i--;
                    break;
                case "RIGHT":
                    j++;
                    break;
                case "DOWN":
                    i++;
                    break;
                case "LEFT":
                    j--;
                    break;
            }
        }
        return i*n+j;
    }
}