package SuanFa.l063;

public class l063 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int len1 = obstacleGrid.length;
        int len2 = obstacleGrid[0].length;
        obstacleGrid[0][0] = 1;
        for (int i = 1;i < len1;i++) {
            if (obstacleGrid[i][0]==0 && obstacleGrid[i-1][0]==1) {
                obstacleGrid[i][0] = 1;
            }
            else {
                obstacleGrid[i][0] = 0;
            }
        }
        for (int j = 1;j < len2;j++) {
            if (obstacleGrid[0][j]==0 && obstacleGrid[0][j-1]==1) {
                obstacleGrid[0][j] = 1;
            }
            else {
                obstacleGrid[0][j] = 0;
            }
        }
        for (int i = 1;i < len1;i++) {
            for (int j = 1;j < len2;j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                }
                else {
                    obstacleGrid[i][j] = obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                }
            }
        }
        return obstacleGrid[len1-1][len2-1];
    }

}
