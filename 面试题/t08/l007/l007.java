package MianShiTi.t08.l007;

import java.util.LinkedList;
import java.util.List;

public class l007 {

    char[] cs;
    int len;
    List<String> result;
    char[] cl;
    boolean[] flag;

    public String[] permutation(String S) {
        cs = S.toCharArray();
        len = cs.length;
        result = new LinkedList<>();
        cl = new char[len];
        flag = new boolean[len];
        dfs(0);
        len = result.size();
        String[] res = new String[len];
        for (int i = 0;i < len;i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public void dfs(int index) {
        if (index == len) {
            result.add(String.valueOf(cl));
            return;
        }
        for (int i = 0;i < len;i++) {
            if (!flag[i]) {
                flag[i] = true;
                cl[index] = cs[i];
                dfs(index+1);
                flag[i] = false;
            }
        }
    }
}
