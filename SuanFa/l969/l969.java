package SuanFa.l969;

import java.util.LinkedList;
import java.util.List;

public class l969 {

    public List<Integer> pancakeSort(int[] arr) {
        int len = arr.length;
        List<Integer> l = new LinkedList<>();
        for (int i = 0;i < len-1;i++) {
            int max_id = 0;
            for (int j = 1;j < len-i;j++) {
                if (arr[j] > arr[max_id]) {
                    max_id = j;
                }
            }
            if (max_id != len-i-1) {
                l.add(max_id+1);
                l.add(len-i);
            }
            fanzhuan(arr, max_id);
        }
        return l;
    }

    public void fanzhuan(int[] arr, int k) {
        for (int i = 0;i < k/2;i++) {
            int tmp = arr[i];
            arr[i] = arr[k-i];
            arr[k-i] = tmp;
        }
    }

}
