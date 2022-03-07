package Book_DataStruct_Algorithm.Sort;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] arrays = {5,8,1,9,0,3,6,4,2,7};
        // 冒泡排序
        bubble(arrays);
        System.out.println(Arrays.toString(arrays));
    }

    public static void bubble(int[] arrays) {
        int n = arrays.length;
        for (int i = 0;i < n-1;i++) {
            boolean flag = true;
            for (int j = 0;j < n-i-1;j++) {
                if (arrays[j] > arrays[j+1]) {
                    flag = false;
                    int tmp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = tmp;
                }
            }
            if (flag) {
                return;
            }
        }
    }
}
