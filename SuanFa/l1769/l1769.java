package SuanFa.l1769;

public class l1769 {

    public int[] minOperations(String boxes) {
        char[] cs = boxes.toCharArray();
        int len = cs.length;
        int left = cs[0]=='1'?1:0;
        int right = 0;
        int total = 0;
        for (int i = 0;i < len;i++) {
            if (cs[i] == '1') {
                right++;
                total+=i;
            }
        }
        int[] result = new int[len];
        result[0] = total;
        for (int i = 1;i < len;i++) {
            if (cs[i] == '1') {
                right--;
            }
            total-=right;
            total+=left;
            if (cs[i] == '1') {
                left++;
            }
            result[i] = total;
        }
        return result;
    }
}
