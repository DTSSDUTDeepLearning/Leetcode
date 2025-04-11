package l2109;

public class l2109 {

    // 不断复制字符到新字符串。如果Java使用字符串本地不断拼接的方法，会超时
    public String addSpaces(String s, int[] spaces) {
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0;i < cs.length;i++) {
            if (index < spaces.length && spaces[index] == i) {
                sb.append(' ');
                index++;
            }
            sb.append(cs[i]);
        }
        return sb.toString();
    }
}
