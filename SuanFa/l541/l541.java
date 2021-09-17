package SuanFa.l541;

public class l541 {

    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        int len = a.length;
        for (int start = 0; start < len; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, len - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }
}
