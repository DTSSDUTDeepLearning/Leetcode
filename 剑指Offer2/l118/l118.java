package JianZhiOffer2.l118;

public class l118 {

    public int[] findRedundantConnection(int[][] edges) {
        int len = edges.length;
        int[] parent = new int[len];
        for (int i = 0;i < len;i++) {
            parent[i] = i;
        }
        int[] result = new int[2];
        for (int[] edge : edges) {
            int node1 = edge[0] - 1;
            int node2 = edge[1] - 1;
            if (find(parent, node1) != find(parent, node2)) {
                union(parent, node1, node2);
            }
            else {
                result = edge;
            }
        }
        return result;
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
