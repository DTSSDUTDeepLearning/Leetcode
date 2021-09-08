package SuanFa.l120;

import java.util.List;

public class l120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int len1 = triangle.size();
        int[] ans = new int[len1];
        ans[0] = triangle.get(0).get(0);
        for (int i = 1;i < len1;i++) {
            List<Integer> tmp = triangle.get(i);
            int len2 = tmp.size();
            ans[len2-1] = ans[len2-2] + tmp.get(len2-1);
            for (int j = len2-2;j > 0;j--) {
                ans[j] = Math.min(ans[j], ans[j-1]) + tmp.get(j);
            }
            ans[0] += tmp.get(0);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0;i < len1;i++) {
            if (min > ans[i]) {
                min = ans[i];
            }
        }
        return min;
    }
}
