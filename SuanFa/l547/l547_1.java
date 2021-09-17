package SuanFa.l547;

public class l547_1 {

    // 使用深度优先搜索
    public static void dfp(int[][] isConnected, boolean[] visited, int start) {
        int len = isConnected.length;
        visited[start] = true;
        for (int i = 0;i < len;i++) {
            if (isConnected[start][i]==1 && !visited[i]) {
                dfp(isConnected, visited, i);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length;
        boolean[] visited = new boolean[len];
        int provinces = 0;
        for (int i = 0;i < len;i++) {
            if (!visited[i]) {
                dfp(isConnected, visited, i);
                provinces++;
            }
        }
        return provinces;
    }
}
