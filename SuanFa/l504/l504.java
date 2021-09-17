package SuanFa.l504;

public class l504 {

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        String result = "";
        boolean flag = false;
        if (num < 0) {
            num = -num;
            flag = true;
        }
        while (num > 0) {
            int x = num%7;
            result = x + result;
            num/=7;
        }
        if (flag) {
            result = "-" + result;
        }
        return result;
    }
}
