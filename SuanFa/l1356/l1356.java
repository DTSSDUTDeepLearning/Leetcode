package SuanFa.l1356;

import java.util.*;

public class l1356 {

    public int[] sortByBits(int[] arr) {
        List<Integer> tmp = new LinkedList<>();
        int[] bit = new int[10001];
        for (int num : arr) {
            tmp.add(num);
            bit[num] = one(num);
        }
        Collections.sort(tmp, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (bit[o1] != bit[o2]) {
                    return bit[o1]-bit[o2];
                }
                else {
                    return o1-o2;
                }
            }
        });
        int len = arr.length;
        for (int i = 0;i < len;i++) {
            arr[i] = tmp.get(i);
        }
        return arr;
    }

    public int one(int n) {
        int cnt = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                cnt++;
            }
            n>>=1;
        }
        return cnt;
    }
}
