package NowCoder.l055;

public class l055 {

    public String longestCommonPrefix (String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int min_len = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < min_len) {
                min_len = str.length();
            }
        }
        int len = strs.length;
        for (int i = 0;i < min_len;i++) {
            char c = strs[0].charAt(i);
            for (int j = 1;j < len;j++) {
                if (c != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
