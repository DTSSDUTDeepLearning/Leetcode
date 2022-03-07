package Book_DataStruct_Algorithm.Graph;

import java.util.Deque;
import java.util.LinkedList;

public class OneOringinShortestPath {

    public static void main(String[] args) {
        System.out.println("获取一张有向有权图的单源最短路径");
        int[][] matrix = Graph.graph_direction_weighted();
        System.out.println("使用Dijkstra算法得到以结点0为源的单源最短路径（保证权重均为非负值）");
        int[] Path = Dijkstra(matrix, 0);
        for (int i = 1;i < matrix.length;i++) {
            System.out.printf("结点0到结点%d的最短路径为%s\n", i, print_path(Path, i));
            System.out.printf("结点0到结点%d的最短路径长度为%d\n", i, cal_path_dis(Path, matrix, i));
        }

//        System.out.println("使用Bellman-Ford算法生成最小生成树，图中可以存在权重和为负值的环路");
//        int[] Path = new int[matrix.length];
//        if (!Bellman_Ford(matrix, 0, Path)) {
//            System.out.println("图中存在权重和为负值的环路，因此单源最短路径不存在");
//        }
//        else {
//            for (int i = 1;i < matrix.length;i++) {
//                System.out.printf("结点0到结点%d的最短路径为%s\n", i, print_path(Path, i));
//                System.out.printf("结点0到结点%d的最短路径长度为%d\n", i, cal_path_dis(Path, matrix, i));
//            }
//        }
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

    public static boolean Bellman_Ford(int[][] matrix, int start, int[] prev) {
        int n = prev.length;
        int[] dis = new int[n];
        for (int i = 0;i < n;i++) {
            prev[i] = i;
            dis[i] = i==start?0:Integer.MAX_VALUE;
        }
        boolean[] visited = new boolean[n];
        visited[start] = true;
        for (int times = 0;times < n;times++) {
            for (int i = 0;i < n;i++) {
                for (int j = 0;j < n;j++) {
                    if (i != j && visited[i] && matrix[i][j] != 0 && dis[i] + matrix[i][j] < dis[j]) {
                        visited[j] = true;
                        dis[j] = dis[i] + matrix[i][j];
                        prev[j] = i;
                    }
                }
            }
        }
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                if (i != j && matrix[i][j] != 0&& dis[i] + matrix[i][j] < dis[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String print_path(int[] Path, int i) {
        Deque<Integer> s = new LinkedList<>();
        int k = i;
        while (k != 0) {
            s.push(k);
            k = Path[k];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (!s.isEmpty()) {
            sb.append("-->");
            sb.append(s.pop());
        }
        return sb.toString();
    }

    public static int cal_path_dis(int[] Path, int[][] matrix, int i) {
        int sum = 0;
        int k;
        while (true) {
            k = Path[i];
            sum+=matrix[k][i];
            if (k == 0) {
                return sum;
            }
            i = k;
        }
    }

}
