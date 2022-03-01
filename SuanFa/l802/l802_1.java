package SuanFa.l802;

import java.util.LinkedList;
import java.util.List;

public class l802_1 {

    // 深度优先搜索+三色标记法
    // color[0]:该节点尚未被访问
    // color[1]:该节点位于递归栈中，或者在某个环上
    // color[2]:该节点搜索完毕，是一个安全节点
//    执行用时：4 ms, 在所有 Java 提交中击败了99.96%的用户
//    内存消耗：47.1 MB, 在所有 Java 提交中击败了73.02%的用户
    int[][] graph;
    int[] color;

    public List<Integer> eventualSafeNodes(int[][] graph) {
        this.graph = graph;
        int len = graph.length;
        color = new int[len];
        List<Integer> result = new LinkedList<>();
        for (int i = 0;i < len;i++) {
            if (isSafe(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean isSafe(int x) {
        if (color[x] > 0) {
            return color[x] == 2;
        }
        color[x] = 1;
        for (int next : graph[x]) {
            if (!isSafe(next)) {
                return false;
            }
        }
        color[x] = 2;
        return true;
    }
}
