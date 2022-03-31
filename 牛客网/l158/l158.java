package NowCoder.l158;

public class l158 {

    public int findShortestPath (int n, int m, int[][] graph) {
        int[][] matrix = new int[n][n];
        for (int i = 0;i < m;i++) {
            matrix[graph[i][0]-1][graph[i][1]-1] = graph[i][2];
        }
        int[] Path = Dijkstra(matrix, 0);
        if (Path[n-1] == n-1) {
            return -1;
        }
        else {
            int sum = 0;
            int prev = n-1;
            while (prev != 0) {
                sum+=matrix[Path[prev]][prev];
                prev = Path[prev];
            }
            return sum;
        }
    }

    public static int[] Dijkstra(int[][] matrix, int start) {
        int n = matrix.length;
        boolean[] visited = new boolean[n];
        visited[start] = true;
        int[] prev = new int[n];
        int[] dis = new int[n];
        for (int i = 0;i < n;i++) {
            if (i == start) {
                prev[i] = i;
                dis[i] = 0;
            }
            else if (matrix[start][i] != 0){
                prev[i] = start;
                dis[i] = matrix[start][i];
            }
            else {
                prev[i] = i;
                dis[i] = Integer.MAX_VALUE;
            }
        }
        for (int k = 0;k < n-1;k++) {
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
            visited[min_end] = true;
            if (dis[min_start] + matrix[min_start][min_end] < dis[min_end]) {
                dis[min_end] = dis[min_start] + matrix[min_start][min_end];
                prev[min_end] = min_start;
            }
        }
        return prev;
    }
}
