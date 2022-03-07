package Book_DataStruct_Algorithm.Graph;

import java.util.Scanner;

public class Graph {

    public static int[][] graph_direction_weighted() {
        System.out.println("开始构造有向有权图");
        Scanner in = new Scanner(System.in);
        System.out.print("请输入图中点的个数：");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        System.out.print("请输入图中边的个数：");
        int m = in.nextInt();
        System.out.println("请输入图中每条边的起点、终点及其权重：");
        for (int i = 0;i < m;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int w = in.nextInt();
            matrix[a][b] = w;
        }
        System.out.println("输入完毕，开始输出");
        for (int i = 0;i < n;i++) {
            System.out.printf("与%d号结点相邻的结点分别是：", i);
            int cnt = 0;
            for (int j = 0;j < n;j++) {
                if (i != j && matrix[i][j] != 0) {
                    cnt++;
                    System.out.printf("%d号结点（权重为%d）\t", j, matrix[i][j]);
                }
            }
            System.out.printf("\n与%d号结点相邻的结点共有%d个\n", i, cnt);
        }
        return matrix;
    }

    public static int[][] graph_direction() {
        System.out.println("开始构造有向无权图");
        Scanner in = new Scanner(System.in);
        System.out.print("请输入图中点的个数：");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        System.out.print("请输入图中边的个数：");
        int m = in.nextInt();
        System.out.println("请输入图中每条边的起点和终点：");
        for (int i = 0;i < m;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            matrix[a][b] = 1;
        }
        System.out.println("输入完毕，开始输出");
        for (int i = 0;i < n;i++) {
            System.out.printf("与%d号结点相邻的结点分别是：", i);
            int cnt = 0;
            for (int j = 0;j < n;j++) {
                if (i != j && matrix[i][j] != 0) {
                    cnt++;
                    System.out.printf("%d号结点\t", j);
                }
            }
            System.out.printf("\n与%d号结点相邻的结点共有%d个\n", i, cnt);
        }
        return matrix;
    }

    public static int[][] graph_weighted() {
        System.out.println("开始构造无向有权图");
        Scanner in = new Scanner(System.in);
        System.out.print("请输入图中点的个数：");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        System.out.print("请输入图中边的个数（不必重复输入无向边）：");
        int m = in.nextInt();
        System.out.println("请输入图中每条边的两个端点及其权重：");
        for (int i = 0;i < m;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int w = in.nextInt();
            matrix[a][b] = w;
            matrix[b][a] = w;
        }
        System.out.println("输入完毕，开始输出");
        for (int i = 0;i < n;i++) {
            System.out.printf("与%d号结点相邻的结点分别是：", i);
            int cnt = 0;
            for (int j = 0;j < n;j++) {
                if (i != j && matrix[i][j] != 0) {
                    cnt++;
                    System.out.printf("%d号结点（权重为%d）\t", j, matrix[i][j]);
                }
            }
            System.out.printf("\n与%d号结点相邻的结点共有%d个\n", i, cnt);
        }
        return matrix;
    }

    public static int[][] graph() {
        System.out.println("开始构造无向无权图");
        Scanner in = new Scanner(System.in);
        System.out.print("请输入图中点的个数：");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        System.out.print("请输入图中边的个数（不必重复输入无向边）：");
        int m = in.nextInt();
        System.out.println("请输入图中每条边的两个端点：");
        for (int i = 0;i < m;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }
        System.out.println("输入完毕，开始输出");
        for (int i = 0;i < n;i++) {
            System.out.printf("与%d号结点相邻的结点分别是：", i);
            int cnt = 0;
            for (int j = 0;j < n;j++) {
                if (i != j && matrix[i][j] != 0) {
                    cnt++;
                    System.out.printf("%d号结点\t", j);
                }
            }
            System.out.printf("\n与%d号结点相邻的结点共有%d个\n", i, cnt);
        }
        return matrix;
    }

    public static void print_graph(int[][] matrix) {
        System.out.println("开始输出图");
        int n = matrix.length;
        for (int i = 0;i < n;i++) {
            System.out.printf("与%d号结点相邻的结点分别是：", i);
            int cnt = 0;
            for (int j = 0;j < n;j++) {
                if (i != j && matrix[i][j] != 0) {
                    cnt++;
                    System.out.printf("%d号结点（权重为%d）\t", j, matrix[i][j]);
                }
            }
            System.out.printf("\n与%d号结点相邻的结点共有%d个\n", i, cnt);
        }
    }
}
