package SuanFa.l599;

import java.util.HashMap;
import java.util.Map;

public class l599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> m = new HashMap<>();
        int len1 = list1.length;
        for (int i = 0;i < len1;i++) {
            m.put(list1[i], i);
        }
        String minString = "";
        int minIndexSum = Integer.MAX_VALUE;
        int len2 = list2.length;
        for (int i = 0;i < len2;i++) {
            String s = list2[i];
            if (m.containsKey(s)) {
                int indexSum = m.get(s)+i;
                if (indexSum == minIndexSum) {
                    minString+=(s+"1234567");
                }
                else if (indexSum < minIndexSum) {
                    minString = (s+"1234567");
                    minIndexSum = indexSum;
                }
            }
        }
        return minString.split("1234567");
    }
}
