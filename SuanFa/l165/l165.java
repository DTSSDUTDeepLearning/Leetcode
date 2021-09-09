package SuanFa.l165;

public class l165 {

    public int compareVersion(String version1, String version2) {
        String[] version_split1 = version1.split("\\.");
        String[] version_split2 = version2.split("\\.");
        if (version_split1.length >= version_split2.length) {
            return compare(version_split1, version_split2);
        }
        else {
            return compare(version_split2, version_split1);
        }
    }

    public int compare(String[] version1, String[] version2) {
        int len1 = version1.length;
        int len2 = version2.length;
        for (int i = 0;i < len2;i++) {
            int num1 = Integer.parseInt(version1[i]);
            int num2 = Integer.parseInt(version2[i]);
            if (num1 < num2) {
                return -1;
            }
            else if (num1 > num2) {
                return 1;
            }
        }
        for (int i = len2;i < len1;i++) {
            if (Integer.parseInt(version1[i]) != 0) {
                return 1;
            }
        }
        return 0;
    }

}
