package NowCoder.l093;

import java.util.LinkedList;
import java.util.List;

public class l093 {

    public int[] LRU (int[][] operators, int k) {
        LRUCache lru = new LRUCache(k);
        List<Integer> l = new LinkedList<>();
        for (int[] op : operators) {
            if (op[0] == 1) {
                lru.put(op[1], op[2]);
            }
            else {
                l.add(lru.get(op[1]));
            }
        }
        int len = l.size();
        int[] result = new int[len];
        for (int i = 0;i < len;i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}
