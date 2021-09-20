package SuanFa.l670;

public class l670 {

    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        char[] cs = s.toCharArray();
        int len = cs.length;
        int[] num_last = new int[10];

        for (int i = 0;i < len;i++) {
            num_last[cs[i]-'0'] = i;
        }
        for (int i = 0;i < len-1;i++) {
            for (int j = 9;j > cs[i]-'0';j--) {
                if (num_last[j] > i) {
                    char tmp = cs[i];
                    cs[i] = cs[num_last[j]];
                    cs[num_last[j]] = tmp;
                    return Integer.parseInt(new String(cs));
                }
            }
        }
        return num;
    }
}
