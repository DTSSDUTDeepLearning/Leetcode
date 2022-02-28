package SuanFa.l797;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class l797 {

    List<List<Integer>> result;
    List<Integer> l;
    boolean[][] matrix;
    int n;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result = new LinkedList<>();
        n = graph.length;
        if (n == 0) {
            return result;
        }
        l = new LinkedList<>();
        l.add(0);
        matrix = new boolean[n][n];
        for (int i = 0;i < n;i++) {
            for (int j : graph[i]) {
                matrix[i][j] = true;
            }
        }
        dfs(0);
        return result;
    }

    public void dfs(int x) {
        if (x == n-1) {
            result.add(new ArrayList<>(l));
            return;
        }
        for (int i = 0;i < n;i++) {
            if (matrix[x][i]) {
                l.add(i);
                dfs(i);
                l.remove(l.size()-1);
            }
        }
    }
}
