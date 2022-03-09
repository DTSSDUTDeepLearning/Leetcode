package SuanFa.l1200;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class l1200 {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> results = new LinkedList<>();
        int len = arr.length;
        int minminus = arr[len-1]-arr[0];
        for (int i = 1;i < len;i++) {
            if (arr[i] - arr[i-1] == minminus) {
                List<Integer> result = new LinkedList<>();
                result.add(arr[i-1]);
                result.add(arr[i]);
                results.add(result);
            }
            else if (arr[i]-arr[i-1] < minminus) {
                results.clear();
                List<Integer> result = new LinkedList<>();
                result.add(arr[i-1]);
                result.add(arr[i]);
                results.add(result);
                minminus = arr[i]-arr[i-1];
            }
        }
        return results;
    }
}
