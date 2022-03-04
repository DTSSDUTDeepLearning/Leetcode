package SuanFa.l905;

import java.util.ArrayList;
import java.util.List;

public class l905_2 {

    // 时间复杂度快一些
    public int[] sortArrayByParity(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int a : A) {
            if (a % 2 == 0) {
                even.add(a);
            }
            else {
                odd.add(a);
            }
        }
        int len1 = even.size();
        int len2 = odd.size();
        int[] result = new int[len1+len2];
        for (int i = 0;i < len1;i++) {
            result[i] = even.get(i);
        }
        for (int i = 0;i < len2;i++) {
            result[i+len1] = odd.get(i);
        }
        return result;
    }
}
