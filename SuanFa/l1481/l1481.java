package SuanFa.l1481;

import java.util.*;

public class l1481 {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : arr) {
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        List<Integer> l = new LinkedList<>();
        for (int num : m.values()) {
            l.add(num);
        }
        Collections.sort(l);
        int cnt = 0;
        int sum = 0;
        for (int num : l) {
            sum+=num;
            if (sum >= k) {
                return cnt;
            }
            else {
                cnt++;
            }
        }
        return 0;
    }
}
