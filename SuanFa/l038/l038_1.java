package SuanFa.l038;

public class l038_1 {

    // 顺序
    public static String countAndSay(int n) {
        String oldstr = "1";
        for (int i = 1;i < n;i++) {
            StringBuilder newstr = new StringBuilder();
            char[] oldstr_cs = oldstr.toCharArray();
            int len = oldstr_cs.length;
            int old_num = 1;
            for (int j = 1;j < len;j++) {
                if (oldstr_cs[j-1] != oldstr_cs[j]) {
                    newstr.append(old_num);
                    newstr.append(oldstr_cs[j-1]);
                    old_num = 1;
                }
                else {
                    old_num++;
                }
            }
            newstr.append(old_num);
            newstr.append(oldstr_cs[len-1]);
            oldstr = newstr.toString();
        }
        return oldstr;
    }

    public static void main(String[] args) {
        for (int i = 1;i < 10;i++) {
            System.out.println(countAndSay(i));
        }
    }
}
