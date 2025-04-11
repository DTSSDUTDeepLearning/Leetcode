package MianShiTi.t08.l007;

import java.util.ArrayList;
import java.util.List;

public class l007 {
    char[] cs;
    int len;
    List<String> result;

    public String[] permutation(String S) {
        cs = S.toCharArray();
        len = cs.length;
        result = new ArrayList<>();
        dfs(0);
        len = result.size();
        String[] res = new String[len];
        for (int i = 0;i < len;i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    private void dfs(int index) {
        if (index == len-1) {
            result.add(String.valueOf(cs));
            return;
        }
        for (int i = index;i < len;i++) {
            swap(index, i);
            dfs(index+1);
            swap(index, i);
        }
    }

    private void swap(int i, int j) {
        char tmp = cs[i];
        cs[i] = cs[j];
        cs[j] = tmp;
    }
}
