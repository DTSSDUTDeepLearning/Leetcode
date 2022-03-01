package SuanFa.l830;

import java.util.ArrayList;
import java.util.List;

public class l830 {

    public List<List<Integer>> largeGroupPositions(String s) {
        int len = s.length();
        List<List<Integer>> results = new ArrayList<>();
        int left = 0;
        for (int i = 1;i < len;i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                if (i-left >= 3) {
                    List<Integer> result = new ArrayList<>();
                    result.add(left);
                    result.add(i-1);
                    results.add(result);
                }
                left = i;
            }
        }
        if (len-left >= 3) {
            List<Integer> result = new ArrayList<>();
            result.add(left);
            result.add(len-1);
            results.add(result);
        }
        return results;
    }
}
