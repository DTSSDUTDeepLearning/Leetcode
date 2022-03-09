package SuanFa.l1232;

public class l1232 {

    public boolean checkStraightLine(int[][] coordinates) {
        int len = coordinates.length;
        if (coordinates[0][0] == coordinates[1][0]) {
            for (int i = 2;i < len;i++) {
                if (coordinates[i][0] != coordinates[0][0]) {
                    return false;
                }
            }
            return true;
        }
        else {
            double k = (double)(coordinates[1][1]-coordinates[0][1])/(double)(coordinates[1][0]-coordinates[0][0]);
            for (int i = 2;i < len;i++) {
                if (coordinates[i][0] == coordinates[0][0]) {
                    return false;
                }
                if ((double)(coordinates[i][1]-coordinates[0][1])/(double)(coordinates[i][0]-coordinates[0][0]) != k) {
                    return false;
                }
            }
            return true;
        }
    }
}
