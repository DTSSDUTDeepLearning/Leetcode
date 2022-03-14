package SuanFa.l1604;

import java.util.*;

public class l1604 {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        int len = keyName.length;
        Map<String, List<Integer>> m = new HashMap<>();
        for (int i = 0;i < len;i++) {
            if (m.containsKey(keyName[i])) {
                m.get(keyName[i]).add(changeTime(keyTime[i]));
            }
            else {
                List<Integer> l = new LinkedList<>();
                l.add(changeTime(keyTime[i]));
                m.put(keyName[i], l);
            }
        }
        List<String> result = new LinkedList<>();
        for (String name : m.keySet()) {
            List<Integer> l = m.get(name);
            Collections.sort(l);
            len = l.size();
            if (len >= 3) {
                for (int i = 0;i < len-2;i++) {
                    if (l.get(i) < l.get(i+2)-60) {
                        result.add(name);
                        break;
                    }
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    public int changeTime(String time) {
        if (time.charAt(0) == '0') {
            return Integer.parseInt(time.substring(1,2))*60+Integer.parseInt(time.substring(3,5));
        }
        else {
            return Integer.parseInt(time.substring(0,2))*60+Integer.parseInt(time.substring(3,5));
        }
    }
}