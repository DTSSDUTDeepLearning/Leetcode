package SuanFa.l038;

public class l038_2 {

    // 递归
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        else {
            String oldstr = countAndSay(n-1);
            String newstr = "";
            int old_num = 1;
            for (int i = 1;i < oldstr.length();i++) {
                if (oldstr.charAt(i-1) != oldstr.charAt(i)) {
                    newstr += String.valueOf(old_num);
                    newstr += String.valueOf(oldstr.charAt(i-1));
                    old_num = 1;
                }
                else {
                    old_num++;
                }
            }
            newstr += String.valueOf(old_num);
            newstr += String.valueOf(oldstr.charAt(oldstr.length()-1));
            return newstr;
        }
    }

    public static void main(String[] args) {
        for (int i = 1;i < 10;i++) {
            System.out.println(countAndSay(i));
        }
    }
}
