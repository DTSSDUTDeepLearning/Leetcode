package SuanFa.l1694;

public class l1694 {

    public String reformatNumber(String number) {
        number = number.replace(" ", "").replace("-", "");
        int len = number.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i+4 < len) {
            sb.append(number.substring(i, i+3));
            sb.append('-');
            i+=3;
        }
        if (i + 4 == len) {
            sb.append(number.substring(i, i+2));
            sb.append('-');
            sb.append(number.substring(i+2, i+4));
        }
        else {
            sb.append(number.substring(i));
        }
        return sb.toString();
    }
}
