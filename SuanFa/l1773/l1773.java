package SuanFa.l1773;

import java.util.List;

public class l1773 {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        if (ruleKey.equals("type")) {
            for (List<String> item : items) {
                if (item.get(0).equals(ruleValue)) {
                    cnt++;
                }
            }
        }
        else if (ruleKey.equals("color")) {
            for (List<String> item : items) {
                if (item.get(1).equals(ruleValue)) {
                    cnt++;
                }
            }
        }
        else if (ruleKey.equals("name")) {
            for (List<String> item : items) {
                if (item.get(2).equals(ruleValue)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
