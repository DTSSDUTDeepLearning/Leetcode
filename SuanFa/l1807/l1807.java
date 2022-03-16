package SuanFa.l1807;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class l1807 {

    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> m = new HashMap<>();
        for (List<String> l : knowledge) {
            m.put(l.get(0), l.get(1));
        }
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (c == ')') {
                flag = false;
                String pat = sb.toString();
                if (m.containsKey(pat)) {
                    pat = m.get(pat);
                }
                else {
                    pat = "?";
                }
                result.append(pat);
                sb = new StringBuilder();
            }
            else if (c == '(') {
                flag = true;
            }
            else if (flag) {
                sb.append(c);
            }
            else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
