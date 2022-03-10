package SuanFa.l1331;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class l1331 {

    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        int[] tmp = new int[len];
        for (int i = 0;i < len;i++) {
            tmp[i] = arr[i];
        }
        Arrays.sort(tmp);
        Map<Integer, Integer> m = new HashMap<>();
        int xuhao = 1;
        for (int num : tmp) {
            if (!m.containsKey(num)) {
                m.put(num, xuhao++);
            }
        }
        for (int i = 0;i < len;i++) {
            tmp[i] = m.get(arr[i]);
        }
        return tmp;
    }
}
