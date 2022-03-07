package Book_DataStruct_Algorithm.Graph;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DFS {

    public static void main(String[] args) {
        System.out.println("使用DFS遍历图（遍历一个无向无权图）");
        DFS(Graph.graph(), 0);
    }

    public static void DFS(int[][] matrix, int start) {
        System.out.printf("深度优先遍历的起点为结点%d\n", start);
        // 使用递归的方法进行深度优先遍历
//        boolean[] visited = new boolean[matrix.length];
//        visited[start] = true;
//        List<Integer> l = new LinkedList<>();
//        l.add(start);
//        DFS_Recursion(matrix, visited, l, start);

        // 使用栈进行深度优先遍历
        List<Integer> l = DFS_Stack(matrix, start);

        System.out.println("深度优先搜索遍历结束，从结点0开始遍历到的点分别是");
        for (int i = 0;i < l.size();i++) {
            System.out.printf("%d\t", l.get(i));
        }
        System.out.println();
    }

    public static void DFS_Recursion(int[][] matrix, boolean[] visited, List<Integer> l, int start) {
        for (int j = 0;j < matrix.length;j++) {
            if (start != j && matrix[start][j] != 0 && !visited[j]) {
                l.add(j);
                visited[j] = true;
                DFS_Recursion(matrix, visited, l, j);
            }
        }
    }

    public static List<Integer> DFS_Stack(int[][] matrix, int start) {
        int n = matrix.length;
        boolean[] visited = new boolean[n];
        visited[start] = true;
        Deque<Integer> s = new LinkedList<>();
        List<Integer> l = new LinkedList<>();
        l.add(start);
        while (true) {
            boolean flag = true;
            for (int j = 0;j < n;j++) {
                if (start != j && matrix[start][j] != 0 && !visited[j]) {
                    visited[j] = true;
                    s.push(start);
                    l.add(j);
                    start = j;
                    flag = false;
                }
            }
            if (flag) {
                if (s.isEmpty()) {
                    break;
                }
                else {
                    start = s.pop();
                }
            }
        }
        return l;
    }
}
