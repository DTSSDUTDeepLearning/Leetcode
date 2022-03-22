package NowCoder.l099;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class l099 {

    int max;
    List<int[]>[] table;

    public int solve (int n, Interval[] Tree_edge, int[] Edge_value) {
        table = new List[n];
        for (int i = 0;i < n;i++) {
            table[i] = new LinkedList<>();
        }
        for (int i = 0;i < n-1;i++) {
            int start = Tree_edge[i].start;
            int end = Tree_edge[i].end;
            table[start].add(new int[]{end, Edge_value[i]});
            table[end].add(new int[]{start, Edge_value[i]});
        }
        dfs(0, -1);
        return max;
    }

    public int dfs(int curr, int last) {
        List<Integer> l = new LinkedList<>();
        for (int[] node : table[curr]) {
            if (node[0] != last) {
                l.add(dfs(node[0], curr) + node[1]);
            }
        }
        Collections.sort(l);
        int len = l.size();
        int sum = 0;
        for (int i = len - 1;i >= 0 && i >= len-2;i--) {
            sum += l.get(i);
        }
        max = Math.max(max, sum);
        return len == 0 ? 0 : l.get(len-1);
    }
}
