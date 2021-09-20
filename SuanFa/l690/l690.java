package SuanFa.l690;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class l690 {

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> m = new HashMap<>();
        for (Employee e : employees) {
            m.put(e.id, e);
        }
        return dfs(m, id);
    }

    public static int dfs(Map<Integer, Employee> m, int id) {
        Employee e = m.get(id);
        int ans = e.importance;
        for (int qid : e.subordinates) {
            ans+=dfs(m, qid);
        }
        return ans;
    }
}
