package SuanFa.l1441;

import java.util.LinkedList;
import java.util.List;

public class l1441 {

    public List<String> buildArray(int[] target, int n) {
        int i = 1;
        List<String> result = new LinkedList<>();
        for (int num : target) {
            if (num == i) {
                result.add("Push");
                i++;
            }
            else {
                while (num != i++) {
                    result.add("Push");
                    result.add("Pop");
                }
                result.add("Push");
            }
        }
        return result;
    }
}
