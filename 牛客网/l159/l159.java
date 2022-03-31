package NowCoder.l159;

public class l159 {

    public int miniSpanningTree (int n, int m, int[][] cost) {
        int[][] matrix = new int[n][n];
        for (int i = 0;i < m;i++) {
            matrix[cost[i][0]-1][cost[i][1]-1] = cost[i][2];
        }
        int[][] results = Prim(matrix);
        int cnt = 0;
        for (int i = 0;i < n;i++) {
            for (int j = i+1;j < n;j++) {
                cnt+=results[i][j];
            }
        }
        return cnt;
    }

    public static int[][] Prim(int[][] matrix) {
        int n = matrix.length;
        int[][] results = new int[n][n];
        boolean[] visited = new boolean[n];
        visited[0] = true;
        for (int times = 1;times < n;times++) {
            int min_start = -1;
            int min_end = -1;
            for (int i = 0;i < n;i++) {
                for (int j = 0;j < n;j++) {
                    if (visited[i] && !visited[j] && matrix[i][j] != 0 && (min_start==-1 || matrix[i][j]<matrix[min_start][min_end])) {
                        min_start = i;
                        min_end = j;
                    }
                }
            }
            results[min_start][min_end] = matrix[min_start][min_end];
            results[min_end][min_start] = matrix[min_start][min_end];
            visited[min_end] = true;
        }
        return results;
    }
}
