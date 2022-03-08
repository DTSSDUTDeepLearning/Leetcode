package SuanFa.l1122;

import java.util.*;

public class l1122_1 {

    // 自定义一种排序方法
//    执行用时：4 ms, 在所有 Java 提交中击败了39.13%的用户
//    内存消耗：38.3 MB, 在所有 Java 提交中击败了82.11%的用户
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> l1 = new ArrayList<>();
        for (int num : arr1) {
            l1.add(num);
        }
        Map<Integer, Integer> m2 = new HashMap<>();
        int len2 = arr2.length;
        for (int i = 0;i < len2;i++) {
            m2.put(arr2[i], i);
        }
        l1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)) {
                    return -1;
                }
                else if (m2.containsKey(o1) && m2.containsKey(o2)) {
                    return m2.get(o1)-m2.get(o2);
                }
                else if (m2.containsKey(o1)) {
                    return -1;
                }
                else if (m2.containsKey(o2)) {
                    return 1;
                }
                else {
                    return o1-o2;
                }
            }
        });
        int len1 = arr1.length;
        for (int i = 0;i < len1;i++) {
            arr1[i] = l1.get(i);
        }
        return arr1;
    }
}
