package NowCoder.l112;

public class l112 {

    public String solve (int M, int N) {
        StringBuilder sb = new StringBuilder();
        if (M > 0) {
            while (M > 0) {
                int mod = M % N;
                if (mod <= 9) {
                    sb.append(mod);
                }
                else {
                    sb.append((char)('A'+mod-10));
                }
                M /= N;
            }
            return sb.reverse().toString();
        }
        else if (M < 0) {
            M = -M;
            while (M > 0) {
                int mod = M % N;
                if (mod <= 9) {
                    sb.append(mod);
                }
                else {
                    sb.append((char)('A'+mod-10));
                }
                M /= N;
            }
            sb.append('-');
            return sb.reverse().toString();
        }
        else {
            return "0";
        }
    }
}
