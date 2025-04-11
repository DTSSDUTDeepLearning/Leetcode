package MianShiTi.t04.l001;

public class l001 {
    int n;
    int[][] graph;
    boolean[] flag;

    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        if (start == target) {
            return true;
        }
        this.n = n;
        this.graph = graph;
        this.flag = new boolean[graph.length];
        return dfs(start, target);
    }

    public boolean dfs(int start, int target) {
        for (int i = 0;i < graph.length;i++) {
            if (!flag[i] && graph[i][1] == target) {
                if (graph[i][0] == start) {
                    return true;
                }
                flag[i] = true;
                if (dfs(start, graph[i][0])) {
                    return true;
                }
                flag[i] = false;
            }
        }
        return false;
    }
}
