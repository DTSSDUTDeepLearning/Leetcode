package SuanFa.l1557;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class l1557 {

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new LinkedList<>();
        Set<Integer> s = new HashSet<>();
        for (List<Integer> edge : edges) {
            s.add(edge.get(1));
        }
        for (int i = 0;i < n;i++) {
            if (!s.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
