package NowCoder.l082;

import java.util.ArrayList;

public class l082 {

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> max_arr = new ArrayList<>();
        int len = num.length;
        if (size == 0 || size > len) {
            return max_arr;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0;i < size;i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        max_arr.add(max);
        for (int i = 1;i < len-size+1;i++) {
            if (num[i-1] != max_arr.get(i-1)) {
                if (num[i+size-1] > max) {
                    max = num[i+size-1];
                }

            }
            else {
                max = num[i];
                for (int j = 1;j < size;j++) {
                    if (max < num[i+j]) {
                        max = num[i+j];
                    }
                }
            }
            max_arr.add(max);
        }
        return max_arr;
    }
}
