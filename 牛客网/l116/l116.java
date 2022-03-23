package NowCoder.l116;

public class l116 {

    public int solve (String nums) {
        char[] cs = nums.toCharArray();
        int len = cs.length;
        if (!(cs[0] > '0' && cs[0] <= '9')) {
            return 0;
        }
        if (len == 1) {
            return 1;
        }
        int[] result = new int[len];
        result[0] = 1;
        if ((cs[1] >= '1' && cs[1] <= '6' && (cs[0] == '1' || cs[0] == '2')) || (cs[1] >= '1' && cs[1] <= '9' && cs[0] == '1')) {
            result[1] = 2;
        }
        else {
            result[1] = 1;
        }
        for (int i = 2;i < len;i++) {
            if (cs[i] == '0') {
                if (cs[i-1] == '1' || cs[i-1] == '2') {
                    result[i] = result[i-1];
                }
                else {
                    return 0;
                }
            }
            else if (cs[i] >= '1' && cs[i] <= '6') {
                if (cs[i-1] == '1' || cs[i-1] == '2') {
                    result[i] = result[i-1] + result[i-2];
                }
                else {
                    result[i] = result[i-1];
                }
            }
            else {
                if (cs[i-1] == '1') {
                    result[i] = result[i-1] + result[i-2];
                }
                else {
                    result[i] = result[i-1];
                }
            }
        }
        return result[len-1];
    }

    public static void main(String[] args) {
        String nums1 = "10000";
        l116 l = new l116();
        l.solve(nums1);
    }
}
