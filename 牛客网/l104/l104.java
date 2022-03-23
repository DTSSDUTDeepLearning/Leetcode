package NowCoder.l104;

public class l104 {

    public int compare (String version1, String version2) {
        String[] v1 = version1.split("[.]");
        String[] v2 = version2.split("[.]");
        int len1 = v1.length;
        int len2 = v2.length;
        if (len1 == len2) {
            for (int i = 0;i < len1;i++) {
                int n1 = Integer.parseInt(v1[i]);
                int n2 = Integer.parseInt(v2[i]);
                if (n1 < n2) {
                    return -1;
                }
                else if (n1 > n2) {
                    return 1;
                }
            }
            return 0;
        }
        else if (len1 > len2) {
            for (int i = 0;i < len2;i++) {
                int n1 = Integer.parseInt(v1[i]);
                int n2 = Integer.parseInt(v2[i]);
                if (n1 < n2) {
                    return -1;
                }
                else if (n1 > n2) {
                    return 1;
                }
            }
            if (len2 + 1 == len1 && Integer.parseInt(v1[len2]) == 0) {
                return 0;
            }
            else {
                return 1;
            }
        }
        else {
            for (int i = 0;i < len1;i++) {
                int n1 = Integer.parseInt(v1[i]);
                int n2 = Integer.parseInt(v2[i]);
                if (n1 < n2) {
                    return -1;
                }
                else if (n1 > n2) {
                    return 1;
                }
            }
            if (len1 + 1 == len2 && Integer.parseInt(v2[len1]) == 0) {
                return 0;
            }
            else {
                return -1;
            }
        }
    }
}
