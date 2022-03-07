package MianShiTi.t01.l005;

public class l005 {

    public boolean oneEditAway(String first, String second) {
        char[] cs1 = first.toCharArray();
        char[] cs2 = second.toCharArray();
        int len1 = cs1.length;
        int len2 = cs2.length;
        if (len1 - len2 == 1) {
            int i = 0;
            for (;i < len2;i++) {
                if (cs1[i] != cs2[i]) {
                    break;
                }
            }
            for (;i < len2;i++) {
                if (cs1[i+1] != cs2[i]) {
                    return false;
                }
            }
            return true;
        }
        else if (len2 - len1 == 1) {
            int i = 0;
            for (;i < len1;i++) {
                if (cs1[i] != cs2[i]) {
                    break;
                }
            }
            for (;i < len1;i++) {
                if (cs1[i] != cs2[i+1]) {
                    return false;
                }
            }
            return true;
        }
        else if (len1 == len2) {
            boolean flag = true;
            for (int i = 0;i < len1;i++) {
                if (cs1[i] != cs2[i]) {
                    if (flag) {
                        flag = false;
                    }
                    else {
                        return false;
                    }
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}
