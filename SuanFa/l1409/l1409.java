package SuanFa.l1409;

import java.util.LinkedList;
import java.util.List;

public class l1409 {

    public int[] processQueries(int[] queries, int m) {
        List<Integer> l = new LinkedList<>();
        for (int i = 1;i <= m;i++) {
            l.add(i);
        }
        int len = queries.length;
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            int index = 0;
            while (index < m && l.get(index) != queries[i]) {
                index++;
            }
            result[i] = index;
            l.remove(index);
            l.add(0, queries[i]);
        }
        return result;
    }
}
