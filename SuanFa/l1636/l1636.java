package SuanFa.l1636;

import java.util.*;

public class l1636 {

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        List<int[]> l = new LinkedList<>();
        for (int num : m.keySet()) {
            l.add(new int[]{num, m.get(num)});
        }
        Collections.sort(l, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] != o2[1]) {
                    return o1[1] - o2[1];
                }
                else {
                    return o2[0] - o1[0];
                }
            }
        });
        int index = 0;
        for (int[] o : l) {
            for (int i = 0;i < o[1];i++) {
                nums[index++] = o[0];
            }
        }
        return nums;
    }
}
