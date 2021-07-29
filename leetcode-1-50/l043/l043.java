package SuanFa.l043;

public class l043 {

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        char[] cs1 = num1.toCharArray();
        char[] cs2 = num2.toCharArray();
        int len1 = cs1.length;
        int len2 = cs2.length;
        int[] result = new int[len1+len2];
        for (int i = len1-1;i >= 0;i--) {
            for (int j = len2-1;j >= 0;j--) {
                result[i+j+1] += (cs1[i] - '0') * (cs2[j] - '0');
            }
        }
        for (int i = len1+len2-1;i > 0;i--) {
            result[i-1] += result[i] / 10;
            result[i] %= 10;
        }
        int index = result[0] == 0 ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        while (index < len1 + len2) {
            sb.append(result[index++]);
        }
        return sb.toString();
    }
}
