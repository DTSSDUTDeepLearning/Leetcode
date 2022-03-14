package SuanFa.l1620;

public class l1620 {

    public int[] bestCoordinate(int[][] towers, int radius) {
        int n = towers.length;
        int[][] xinhao = new int[51][51];
        boolean[][] flag = new boolean[51][51];
        for (int t = 0;t < n;t++) {
            int i_max = Math.min(50, towers[t][0]+radius);
            int j_max = Math.min(50, towers[t][1]+radius);
            for (int i = Math.max(0, towers[t][0]-radius);i <= i_max;i++) {
                for (int j = Math.max(0, towers[t][1]-radius);j <= j_max;j++) {
                    if (!flag[i][j]) {
                        flag[i][j] = true;
                        for (int k = 0;k < n;k++) {
                            int dis_sqr = (towers[k][0]-i)*(towers[k][0]-i)+(towers[k][1]-j)*(towers[k][1]-j);
                            if (dis_sqr <= radius*radius) {
                                xinhao[i][j] += (int)(towers[k][2] / (1 + Math.sqrt(dis_sqr)));
                            }
                        }
                    }
                }
            }
        }
        int max = 0;
        int max_i = 0;
        int max_j = 0;
        for (int i = 0;i < 51;i++) {
            for (int j = 0;j < 51;j++) {
                if (xinhao[i][j] > max) {
                    max = xinhao[i][j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        return new int[]{max_i, max_j};
    }
}
