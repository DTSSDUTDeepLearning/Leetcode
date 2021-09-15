package SuanFa.l415;

public class l415 {

    public static String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        if (len1 < len2) {
            return addStrings(num2, num1);
        }
        boolean flag = false;
        String result = "";
        for (int i = 0;i < len2;i++) {
            char c1 = num1.charAt(len1-1-i);
            char c2 = num2.charAt(len2-1-i);
            int n1 = c1-48;
            int n2 = c2-48;
            int add = n1+n2;
            if (flag) {
                add++;
                if (add < 10) {
                    flag = false;
                }
            }
            else {
                if (add >= 10) {
                    flag = true;
                }
            }
            result = add%10 + result;
        }
        for (int i = len2;i < len1;i++) {
            char c = num1.charAt(len1-1-i);
            int n = c-48;
            if (flag) {
                n++;
                if (n < 10) {
                    flag = false;
                }
            }
            else {
                if (n == 10) {
                    flag = true;
                }
            }
            result = n%10 + result;
        }
        if (flag) {
            result = "1" + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String num1 = "98";
        String num2 = "987";
        System.out.println(addStrings(num1, num2));
    }
}
