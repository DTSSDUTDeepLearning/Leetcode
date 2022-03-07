package Book_DataStruct_Algorithm.Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    public static void main(String[] args) {
        System.out.println("使用BFS遍历图（遍历一个无向无权图）");
        BFS(Graph.graph(), 0);
    }

    public static void BFS(int[][] matrix, int start) {
        System.out.printf("广度优先遍历的起点为结点%d\n", start);
        int n = matrix.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        List<Integer> l = new LinkedList<>();
        visited[start] = true;
        q.offer(start);
        l.add(start);
        while (!q.isEmpty()) {
            int i = q.poll();
            for (int j = 0;j < n;j++) {
                if (j != i && matrix[i][j] != 0 && !visited[j]) {
                    visited[j] = true;
                    q.offer(j);
                    l.add(j);
                }
            }
        }
        System.out.println("广度优先搜索遍历结束，从结点0开始遍历到的点分别是");
        for (int i = 0;i < l.size();i++) {
            System.out.printf("%d\t", l.get(i));
        }
        System.out.println();
    }
}
