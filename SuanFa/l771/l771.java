package SuanFa.l771;

import java.util.HashSet;
import java.util.Set;

public class l771 {

    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> s = new HashSet<>();
        int len1 = jewels.length();
        int len2 = stones.length();
        for (int i = 0;i < len1;i++) {
            s.add(jewels.charAt(i));
        }
        int cnt = 0;
        for (int i = 0;i < len2;i++) {
            if (s.contains(stones.charAt(i))) {
                cnt++;
            }
        }
        return cnt;
    }
}
