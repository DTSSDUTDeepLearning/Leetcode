package MianShiTi.t05.l002;

public class l002 {

    public String printBin(double num) {
        StringBuilder sb = new StringBuilder("0.");
        while (num != 0 && sb.length() <= 32) {
            num *= 2;
            if (num >= 1) {
                sb.append('1');
                num-=1;
            }
            else {
                sb.append('0');
            }
        }
        if (num != 0) {
            return "ERROR";
        }
        else {
            return sb.toString();
        }
    }
}
