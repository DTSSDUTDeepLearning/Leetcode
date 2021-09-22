package SuanFa.l743;

import java.util.Arrays;

public class l743 {

    public int networkDelayTime(int[][] times, int n, int k) {
        k--;
        int[][] matrix = new int[n][n];
        for (int i = 0;i < n;i++) {
            Arrays.fill(matrix[i], Integer.MAX_VALUE);
        }
        for (int[] time : times) {
            matrix[time[0]-1][time[1]-1] = time[2];
        }
        boolean[] visited = new boolean[n];
        visited[k] = true;
        int[] dis = new int[n];
        for (int j = 0;j < n;j++) {
            dis[j] = matrix[k][j];
        }
        dis[k] = 0;
        for (int i = 1;i < n;i++) {
            boolean flag = false;
            int min = Integer.MAX_VALUE;
            int min_j = -1;
            for (int j = 0;j < n;j++) {
                if (!visited[j] && dis[j] != Integer.MAX_VALUE) {
                    flag = true;
                    if (dis[j] < min) {
                        min = dis[j];
                        min_j = j;
                    }
                }
            }
            if (flag && min_j != -1) {
                visited[min_j] = true;
                for (int j = 0;j < n;j++) {
                    if (!visited[j] && matrix[min_j][j] != Integer.MAX_VALUE && dis[j] > dis[min_j] + matrix[min_j][j]) {
                        dis[j] = dis[min_j] + matrix[min_j][j];
                    }
                }
            }
            else {
                return -1;
            }
        }
        int max = 0;
        for (int i = 0;i < n;i++) {
            max = Math.max(max, dis[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] times1 = {{3,5,78},{2,1,1},{1,3,0},{4,3,59},{5,3,85},{5,2,22},{2,4,23},{1,4,43},{4,5,75},{5,1,15},{1,5,91},{4,1,16},{3,2,98},{3,4,22},{5,4,31},{1,2,0},{2,5,4},{4,2,51},{3,1,36},{2,3,59}};
        int n1 = 5;
        int k1 = 5;
        l743 l = new l743();
        System.out.println(l.networkDelayTime(times1, n1, k1));
    }
}
