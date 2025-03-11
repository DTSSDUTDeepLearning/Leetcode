package l984;

public class l984 {

    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        if (a > b) {
            if (a-b >= b) {
                for (int i = 0;i < b;i++) {
                    sb.append("aab");
                }
                for (int i = 0;i < (a-b)-b;i++) {
                    sb.append("a");
                }
            }
            else {
                for (int i = 0;i < a-b;i++) {
                    sb.append("aab");
                }
                for (int i = 0;i < b-(a-b);i++) {
                    sb.append("ab");
                }
            }
        }
        else if (a < b) {
            if (b-a >= a) {
                for (int i = 0;i < a;i++) {
                    sb.append("bba");
                }
                for (int i = 0;i < (b-a)-a;i++) {
                    sb.append("b");
                }
            }
            else {
                for (int i = 0;i < b-a;i++) {
                    sb.append("bba");
                }
                for (int i = 0;i < a-(b-a);i++) {
                    sb.append("ba");
                }
            }
        }
        else {
            for (int i = 0;i < a;i++) {
                sb.append("ab");
            }
        }
        return sb.toString();
    }
}
