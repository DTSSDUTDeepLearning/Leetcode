package SuanFa.l1424;

import java.util.*;

public class l1424 {

    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int len = nums.size();
        int total_len = 0;
        Map<Integer, List<Integer>> m = new LinkedHashMap<>();
        for (int i = 0;i < len;i++) {
            int size = nums.get(i).size();
            total_len += size;
            for (int j = 0;j < size;j++) {
                List<Integer> l = m.getOrDefault(i+j, new LinkedList<>());
                l.add(nums.get(i).get(j));
                m.putIfAbsent(i+j, l);
                // 写putIfAbsent的时间为33ms，put的时间为35ms
            }
        }
        int[] result = new int[total_len];
        int index = 0;
        for (int key : m.keySet()) {
            List<Integer> l = m.get(key);
            int size = l.size();
            for (int j = size-1;j >= 0;j--) {
                result[index++] = l.get(j);
            }
        }
        return result;
    }
}
