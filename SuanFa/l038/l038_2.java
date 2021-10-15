package SuanFa.l038;

public class l038_2 {

    // 递归
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        else {
            char[] oldstr_cs = countAndSay(n-1).toCharArray();
            StringBuilder newstr = new StringBuilder();
            int old_num = 1;
            int len = oldstr_cs.length;
            for (int i = 1;i < len;i++) {
                if (oldstr_cs[i-1] != oldstr_cs[i]) {
                    newstr.append(old_num);
                    newstr.append(oldstr_cs[i-1]);
                    old_num = 1;
                }
                else {
                    old_num++;
                }
            }
            newstr.append(old_num);
            newstr.append(oldstr_cs[len-1]);
            return newstr.toString();
        }
    }

    public static void main(String[] args) {
        for (int i = 1;i < 10;i++) {
            System.out.println(countAndSay(i));
        }
    }
}
