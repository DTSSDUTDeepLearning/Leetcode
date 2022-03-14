package SuanFa.l1663;

public class l1663 {

    public String getSmallestString(int n, int k) {
        if (n == k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0;i < n;i++) {
                sb.append('a');
            }
            return sb.toString();
        }
        else if (n*26 == k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0;i < n;i++) {
                sb.append('z');
            }
            return sb.toString();
        }
        int z = (k-n)/25;
        int a = n-z-1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < a;i++) {
            sb.append('a');
        }
        sb.append((char)(k-a-26*z+'a'-1));
        for (int i = 0;i < z;i++) {
            sb.append('z');
        }
        return sb.toString();
    }
}
