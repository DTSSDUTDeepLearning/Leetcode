package SuanFa.l1041;

public class l1041 {

    public boolean isRobotBounded(String instructions) {
        int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int[] pos = {0,0};
        int forward = 0;
        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                pos[0]+=dir[forward][0];
                pos[1]+=dir[forward][1];
            }
            else if (c == 'L') {
                if (forward == 0) {
                    forward = 3;
                }
                else {
                    forward--;
                }
            }
            else {
                if (forward == 3) {
                    forward = 0;
                }
                else {
                    forward++;
                }
            }
        }
        return pos[0]==0 && pos[1]==0 || forward!=0;
    }
}
