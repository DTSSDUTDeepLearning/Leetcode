package JianZhiOffer.l038;

import java.util.*;

public class l038 {

    List<String> result;
    char[] cs;
    int len;

    public String[] permutation(String s) {
        result = new ArrayList<>();
        cs = s.toCharArray();
        len = cs.length;
        dfs(0);
        return result.toArray(new String[result.size()]);
    }

    public void dfs(int x) {
        if (x == len-1) {
            result.add(String.valueOf(cs));
            return;
        }
        Set<Character> s = new HashSet<>();
        for (int i = x;i < len;i++) {
            if (!s.contains(cs[i])) {
                s.add(cs[i]);
                swap(i, x);
                dfs(x+1);
                swap(i, x);
            }
        }
    }

    public void swap(int a, int b) {
        char c = cs[a];
        cs[a] = cs[b];
        cs[b] = c;
    }
}
