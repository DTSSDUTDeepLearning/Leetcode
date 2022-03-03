package SuanFa.l893;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class l893 {

    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String s : A) {
            int[] cnt = new int[52];
            char[] cs = s.toCharArray();
            int len = cs.length;
            for (int i = 0;i < len;i++) {
                cnt[cs[i]-'a'+26*(i%2)]++;
            }
            set.add(Arrays.toString(cnt));
        }
        return set.size();
    }
}
