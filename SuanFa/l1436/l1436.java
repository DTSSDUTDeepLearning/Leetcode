package SuanFa.l1436;

import java.util.*;

public class l1436 {

    public String destCity(List<List<String>> paths) {
        Map<String, String> m = new HashMap<>();
        for (List<String> path : paths) {
            m.put(path.get(0), path.get(1));
        }
        for (String s : m.values()) {
            if (!m.containsKey(s)) {
                return s;
            }
        }
        return "";
    }
}
