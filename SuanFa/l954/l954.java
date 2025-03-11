package l954;

import java.util.*;

public class l954 {

    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int num : arr) {
            cnt.put(num, cnt.getOrDefault(num, 0)+1);
        }
        if (cnt.containsKey(0) && cnt.get(0)%2!=0) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        for (int num : cnt.keySet()) {
            list.add(num);
        }
        Collections.sort(list, (a,b)->Math.abs(a)-Math.abs(b));
        for (int num : list) {
            if (cnt.getOrDefault(2*num, 0) < cnt.get(num)) {
                return false;
            }
            cnt.put(2*num, cnt.getOrDefault(2*num, 0)-cnt.get(num));
        }
        return true;
    }
}
