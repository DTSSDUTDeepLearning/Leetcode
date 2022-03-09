package SuanFa.l1291;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class l1291 {

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new LinkedList<>();
        for (int i = 1;i < 9;i++) {
            int a = i;
            for (int j = i+1;j <= 9;j++) {
                a = a*10+j;
                if (a >= low && a <= high) {
                    result.add(a);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}
