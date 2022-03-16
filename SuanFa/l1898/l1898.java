package SuanFa.l1898;

public class l1898 {

    int[] removeable;
    char[] ss;
    char[] ps;
    int len1;
    int len2;

    public int maximumRemovals(String s, String p, int[] removable) {
        this.removeable = removable;
        ss = s.toCharArray();
        ps = p.toCharArray();
        len1 = ss.length;
        len2 = ps.length;

        int left = 0;
        int right = removable.length;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (isSubsequence(mid)) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        return left-1;
    }

    public boolean isSubsequence(int k) {
        System.out.println("k = "+ k);
        boolean[] remove = new boolean[len1];
        for (int i = 0;i < k;i++) {
            remove[removeable[i]] = true;
        }
        int i = 0;
        for (int j = 0;j < len2;j++) {
            while (i < len1 && (remove[i] || ss[i] != ps[j])) {
                i++;
            }
            if (i == len1) {
                return false;
            }
            i++;
        }
        return true;
    }
}
