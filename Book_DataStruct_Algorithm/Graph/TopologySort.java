package Book_DataStruct_Algorithm.Graph;

import java.util.Arrays;

public class TopologySort {

    public static void main(String[] args) {
        System.out.println("获取一张有向无权图的拓扑排序");
        int[][] matrix = Graph.graph_direction();
        System.out.println("开始进行拓扑排序");
        int[] l = new int[matrix.length];
        if (TopologySort(matrix, l)) {
            System.out.print("拓扑排序的结果为：");
            System.out.println(Arrays.toString(l));
        }
        else {
            System.out.println("图中存在环，无法进行拓扑排序");
        }
    }

    public static boolean TopologySort(int[][] matrix, int[] sorted) {
        int n = matrix.length;
        int[] in_degree = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0;i < n;i++) {
            int cnt = 0;
            for (int j = 0;j < n;j++) {
                if (i!=j && matrix[j][i]!=0) {
                    cnt++;
                }
            }
            in_degree[i] = cnt;
        }
        System.out.print("初始入度为：");
        System.out.println(Arrays.toString(in_degree));
        for (int i = 0;i < n;i++) {
            boolean flag = true;
            for (int j = 0;j < n;j++) {
                if (!visited[j] && in_degree[j] == 0) {
                    flag = false;
                    sorted[i] = j;
                    visited[j] = true;
                    break;
                }
            }
            if (flag) {
                return false;
            }
            System.out.printf("第%d次循环结束，结点为%d",i,sorted[i]);
            for (int j = 0;j < n;j++) {
                if (!visited[j] && matrix[sorted[i]][j] != 0) {
                    in_degree[j]--;
                }
            }
            System.out.print("入度变为");
            System.out.println(Arrays.toString(in_degree));
        }
        return true;
    }


}
