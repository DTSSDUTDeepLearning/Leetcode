package SuanFa.l925;

public class l925 {

    public boolean isLongPressedName(String name, String typed) {
        char[] name_cs = name.toCharArray();
        char[] typed_cs = typed.toCharArray();
        int len1 = name_cs.length;
        int len2 = typed_cs.length;
        int i1 = 0;
        int i2 = 0;
        while (i1 < len1 && i2 < len2) {
            if (name_cs[i1] != typed_cs[i2]) {
                return false;
            }
            int j1 = i1;
            while (j1 < len1-1 && name_cs[j1] == name_cs[j1+1]) {
                j1++;
            }
            int j2 = i2;
            while (j2 < len2-1 && typed_cs[j2] == typed_cs[j2+1]) {
                j2++;
            }
            if (j2-i2 < j1-i1) {
                return false;
            }
            i1 = j1+1;
            i2 = j2+1;
        }
        if (i1 == len1 && i2 == len2) {
            return true;
        }
        else {
            return false;
        }
    }
}
