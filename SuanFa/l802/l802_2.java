package SuanFa.l802;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l802_2 {

    // 先将图反向，再用拓扑排序进行判断
//    执行用时：16 ms, 在所有 Java 提交中击败了29.98%的用户
//    内存消耗：47.9 MB, 在所有 Java 提交中击败了60.74%的用户
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int len = graph.length;
        List<Integer>[] table = new List[len];
        for (int i = 0;i < len;i++) {
            table[i] = new LinkedList<>();
        }
        int[] inDegree = new int[len];
        for (int i = 0;i < len;i++) {
            inDegree[i] = graph[i].length;
            for (int pre : graph[i]) {
                table[pre].add(i);
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0;i < len;i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int next : table[cur]) {
                if (--inDegree[next] == 0) {
                    q.offer(next);
                }
            }
        }
        List<Integer> result = new LinkedList<>();
        for (int i = 0;i < len;i++) {
            if (inDegree[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
