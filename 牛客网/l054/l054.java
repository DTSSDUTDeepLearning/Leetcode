package NowCoder.l054;

import java.util.ArrayList;
import java.util.Arrays;

public class l054 {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        int len = num.length;
        if (len < 3) {
            return results;
        }
        for (int i = 0;i < len-2;i++) {
            int j = i+1;
            int k = len-1;
            while (j < k) {
                if (num[i]+num[j]+num[k]==0) {
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(num[i]);
                    result.add(num[j]);
                    result.add(num[k]);
                    results.add(result);
                    while (j+1 < k && num[j+1] == num[j]) {
                        j++;
                    }
                    while (j+1 < k && num[k-1] == num[k]) {
                        k--;
                    }
                    j++;
                    k--;
                }
                else if (num[i]+num[j]+num[k]>0) {
                    k--;
                }
                else {
                    j++;
                }
                while (i+1 < len-2 && num[i+1] == num[i]) {
                    i++;
                }
            }
        }
        return results;
    }
}
