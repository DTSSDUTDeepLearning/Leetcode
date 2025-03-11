package l1023;

import java.util.LinkedList;
import java.util.List;

public class l1023 {

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new LinkedList<>();
        char[] pat = pattern.toCharArray();
        for (String query : queries) {
            char[] cs = query.toCharArray();
            int indexP = 0;
            int indexC = 0;
            while (indexP < pat.length && indexC < cs.length) {
                if (pat[indexP] == cs[indexC]) {
                    indexP++;
                }
                else if (cs[indexC] >= 'A' && cs[indexC] <= 'Z') {
                    break;
                }
                indexC++;
            }
            if (indexP != pat.length) {
                result.add(false);
            }
            else {
                boolean flag = true;
                for (int i = indexC;i < cs.length;i++) {
                    if (cs[i] >= 'A' && cs[i] <= 'Z') {
                        flag = false;
                        break;
                    }
                }
                result.add(flag);
            }
        }
        return result;
    }
}
