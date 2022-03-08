package SuanFa.l1122;

import java.util.*;

public class l1122_2 {

    // 计数排序
//    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
//    内存消耗：38.6 MB, 在所有 Java 提交中击败了45.47%的用户
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }
        int[] result = arr1;
        int index = 0;
        for (int num : arr2) {
            for (int i = 0;i < count[num];i++) {
                result[index+i] = num;
            }
            index+=count[num];
            count[num] = 0;
        }
        for (int i = 0;i <= 1000;i++) {
            if (count[i] != 0) {
                for (int j = 0;j < count[i];j++){
                    result[index+j] = i;
                }
                index+=count[i];
            }
        }
        return result;
    }
}
