package SuanFa.l1487;

import java.util.HashMap;
import java.util.Map;

public class l1487 {

    public String[] getFolderNames(String[] names) {
        Map<String, Integer> m = new HashMap<>();
        int len = names.length;
        for (int i = 0;i < len;i++) {
            if (!m.containsKey(names[i])) {
                m.put(names[i], 1);
            }
            else {
                int cnt = m.get(names[i]);
                while (m.containsKey(names[i] + "(" + cnt + ")")) {
                    cnt++;
                }
                // 如果还想改进的话，上面部分可以用二分法来查找
                m.put(names[i] + "(" + cnt + ")", 1);
                m.put(names[i], m.get(names[i]) + 1);
                names[i] = names[i] + "(" + cnt + ")";
            }
        }
        return names;
    }

}
