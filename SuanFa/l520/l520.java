package SuanFa.l520;

public class l520 {

    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if (len == 1) {
            return true;
        }
        char c = word.charAt(0);
        if (c >= 'A' && c <= 'Z') {
            c = word.charAt(1);
            if (c >= 'A' && c <= 'Z') {
                for (int i = 2;i < len;i++) {
                    c = word.charAt(i);
                    if (c >= 'a' && c <= 'z') {
                        return false;
                    }
                }
                return true;
            }
            else {
                for (int i = 2;i < len;i++) {
                    c = word.charAt(i);
                    if (c >= 'A' && c <= 'Z') {
                        return false;
                    }
                }
                return true;
            }
        }
        else {
            for (int i = 1;i < len;i++) {
                c = word.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    return false;
                }
            }
            return true;
        }
    }
}
