package SuanFa.l1017;

public class l1017 {

    public String baseNeg2(int N) {
        if (N == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (N != 1) {
            if (N > 0 || N % (-2) != -1) {
                sb.append(N % (-2));
                N /= -2;
            }
            else {
                sb.append(1);
                N = N / (-2) + 1;
            }
        }
        sb.append("1");
        return sb.reverse().toString();
    }
}
