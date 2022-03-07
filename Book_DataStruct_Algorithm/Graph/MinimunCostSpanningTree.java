package Book_DataStruct_Algorithm.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MinimunCostSpanningTree {

    public static void main(String[] args) {
        System.out.println("生成一张无向有权图的最小生成树(MST)");
        int[][] matrix = Graph.graph_weighted();
        System.out.println("使用Prim算法生成最小生成树");
        int[][] MST1 = Prim(matrix);
        Graph.print_graph(MST1);
        System.out.println("使用Kruskal算法生成最小生成树");
        int[][] MST2 = Kruskal(matrix);
        Graph.print_graph(MST2);
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

    public static int[][] Kruskal(int[][] matrix) {
        int n = matrix.length;
        int[][] results = new int[n][n];
        int[] tokens = new int[n];
        for (int i = 0;i < n;i++) {
            tokens[i] = i;
        }
        for (int times = 1;times < n;times++) {
            int min_start = -1;
            int min_end = -1;
            for (int i = 0;i < n;i++) {
                for (int j = 0;j < n;j++) {
                    if (tokens[i]!=tokens[j] && matrix[i][j] != 0 && (min_start==-1 || matrix[i][j]<matrix[min_start][min_end])) {
                        min_start = i;
                        min_end = j;
                    }
                }
            }
            results[min_start][min_end] = matrix[min_start][min_end];
            results[min_end][min_start] = matrix[min_start][min_end];
            int min_token = Math.min(tokens[min_start], tokens[min_end]);
            int max_token = Math.max(tokens[min_start], tokens[min_end]);
            for (int i = 0;i < n;i++) {
                if (tokens[i] == max_token) {
                    tokens[i] = min_token;
                }
            }
        }
        return results;
    }
}
