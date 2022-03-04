package SuanFa.l944;

public class l944 {

    public int minDeletionSize(String[] strs) {
        int m = strs.length;
        int n = strs[0].length();
        int cnt = 0;
        for (int j = 0;j < n;j++) {
            char tmp1 = strs[0].charAt(j);
            for (int i = 1;i < m;i++) {
                char tmp2 = strs[i].charAt(j);
                if (tmp1 < tmp2) {
                    cnt++;
                    break;
                }
                else {
                    tmp1 = tmp2;
                }
            }
        }
        return cnt;
    }
}
