package JianZhiOffer2.l116;

import java.util.HashSet;
import java.util.Set;

public class l116_1 {

    // 使用并查集，速度快于广度优先搜索，但慢于深度优先搜索
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] parent = new int[n];
        for (int i = 0;i < n;i++) {
            parent[i] = i;
        }
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                if (i != j && isConnected[i][j] == 1) {
                    union(parent, i, j);
                }
            }
        }
        Set<Integer> s = new HashSet<>();
        for (int i = 0;i < n;i++) {
            s.add(find(parent, i));
        }
        return s.size();
    }

    public void union(int[] parent, int index1, int index2) {
        parent[find(parent, index2)] = find(parent, index1);
    }

    public int find(int[] parent, int index) {
        if (parent[index] != index) {
            parent[index] = find(parent, parent[index]);
        }
        return parent[index];
    }
}
