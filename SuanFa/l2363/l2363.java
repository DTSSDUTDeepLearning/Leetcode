package l2363;

import java.util.*;

public class l2363 {

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] item : items1) {
            map.put(item[0], map.getOrDefault(item[0], 0)+item[1]);
        }
        for (int[] item : items2) {
            map.put(item[0], map.getOrDefault(item[0], 0)+item[1]);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> l = new ArrayList<>();
            l.add(entry.getKey());
            l.add(entry.getValue());
            result.add(l);
        }
        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });
        return result;
    }
}
