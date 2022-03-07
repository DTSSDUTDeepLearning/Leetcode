package Book_DataStruct_Algorithm.Graph;

public class NodePairShortestPath {

    public static void main(String[] args) {
        System.out.println("获取一张有向有权图的顶点对之间的最短路径");
        int[][] matrix = Graph.graph_direction_weighted();
        System.out.println("使用Floyd算法得到该图的顶点对之间的最短路径（保证权不存在权重和为负值的环路）");
        int n = matrix.length;
        int[][] Path = new int[n][n];
        int[][] dis = new int[n][n];
        Floyd(matrix, Path, dis);
        System.out.println("Floyd算法运行结束，开始生成结果");
        System.out.println("生成距离矩阵");
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                System.out.printf("%d\t", dis[i][j]);
            }
            System.out.println();
        }
        System.out.println("生成前一个结点矩阵");
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                System.out.printf("%d\t", Path[i][j]);
            }
            System.out.println();
        }
    }

    public static void Floyd(int[][] matrix, int[][] prev, int[][] dis) {
        int n = matrix.length;
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                prev[i][j] = i;
                if (i == j) {
                    dis[i][i] = 0;
                }
                else if (matrix[i][j] != 0) {
                    dis[i][j] = matrix[i][j];
                }
                else {
                    dis[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int k = 0;k < n;k++) {
            for (int i = 0;i < n;i++) {
                for (int j = 0;j < n;j++) {
                    if (dis[i][j] > dis[i][k]+dis[k][j]) {
                        dis[i][j] = dis[i][k]+dis[k][j];
                        prev[i][j] = k;
                    }
                }
            }
        }
    }
}
