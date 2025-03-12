package l3159;

import java.util.ArrayList;
import java.util.List;

public class l3159 {

    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] == x) {
                indices.add(i);
            }
        }
        for (int i = 0;i < queries.length;i++) {
            if (indices.size() < queries[i]) {
                queries[i] = -1;
            }
            else {
                queries[i] = indices.get(queries[i] - 1);
            }
        }
        return queries;
    }
}