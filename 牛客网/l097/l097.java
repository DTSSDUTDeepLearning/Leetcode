package NowCoder.l097;

import java.util.*;

public class l097 {

    public String[][] topKstrings (String[] strings, int k) {
        if (k == 0) {
            return new String[][]{};
        }
        String[][] res = new String[k][2];
        TreeMap<String, Integer> tmap = new TreeMap<>();
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            tmap.put(s, tmap.getOrDefault(s, 0)+1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(tmap.entrySet());
        Collections.sort(list,
                (o1, o2) -> (o1.getValue().compareTo(o2.getValue()) == 0 ? o1.getKey().compareTo(o2.getKey()) : o2.getValue().compareTo(o1.getValue()))
        );
        for (int i = 0; i < k; i++) {
            res[i][0] = list.get(i).getKey();
            res[i][1] = String.valueOf(list.get(i).getValue());
        }
        return res;
    }
}
