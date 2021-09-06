package SuanFa.l038;

public class l038_1 {

    // 顺序
    public static String countAndSay(int n) {
        String oldstr = "1";
        String newstr = "";
        for (int i = 1;i < n;i++) {
            newstr = "";
            int len = oldstr.length();
            int old_num = 1;
            for (int j = 1;j < len;j++) {
                if (oldstr.charAt(j-1) != oldstr.charAt(j)) {
                    newstr += String.valueOf(old_num);
                    newstr += String.valueOf(oldstr.charAt(j-1));
                    old_num = 1;
                }
                else {
                    old_num++;
                }
            }
            newstr += String.valueOf(old_num);
            newstr += String.valueOf(oldstr.charAt(len-1));
            oldstr = newstr;
        }
        return oldstr;
    }

    public static void main(String[] args) {
        for (int i = 1;i < 10;i++) {
            System.out.println(countAndSay(i));
        }
    }
}
