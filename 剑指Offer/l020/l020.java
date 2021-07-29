package JianZhiOffer.l020;

public class l020 {

    public static boolean is0_9(char c) {
        return (c >= '0') && (c <= '9');
    }

    public static boolean isnoncharNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        for (int i = 0;i < s.length();i++) {
            if (!is0_9(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        int left = 0;
        for (;left < s.length();left++) {
            if (s.charAt(left) != ' ') {
                break;
            }
        }
        if (left == s.length()) {
            return false;
        }
        int right = s.length()-1;
        for (;right >= 0;right--) {
            if (s.charAt(right) != ' ') {
                break;
            }
        }
        s = s.substring(left,right+1);
        if (s.length() == 1) {
            if (is0_9(s.charAt(0))) {
                return true;
            }
            else {
                return false;
            }
        }
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            s = s.substring(1);
        }
        // 相比于leetcode65，这里也支持用E表示指数
        int indexe = s.indexOf("e");
        int indexE = s.indexOf("E");
        if (indexe != indexE && indexe != -1 && indexE != -1) {
            return false;
        }
        if (indexe == -1) {
            indexe = indexE;
        }
        if (indexe == 0) {
            return false;
        }
        if (indexe == -1) {
            int indexpoint = s.indexOf(".");
            if (indexpoint == -1) {
                return isnoncharNumber(s);
            }
            else if (indexpoint == 0) {
                return isnoncharNumber(s.substring(1));
            }
            else if (indexpoint == s.length()-1) {
                return isnoncharNumber(s.substring(0, indexpoint));
            }
            else {
                return isnoncharNumber(s.substring(0,indexpoint)) && isnoncharNumber(s.substring(indexpoint+1));
            }
        }
        else {
            if (indexe == s.length()-1) {
                return false;
            }
            int indexpoint = s.indexOf(".");
            if (indexpoint == -1) {
                if (s.charAt(indexe+1) == '+' || s.charAt(indexe+1) == '-') {
                    return isnoncharNumber(s.substring(0, indexe)) && isnoncharNumber(s.substring(indexe+2));
                }
                else {
                    return isnoncharNumber(s.substring(0, indexe)) && isnoncharNumber(s.substring(indexe+1));
                }
            }
            else if (indexpoint > indexe) {
                return false;
            }
            else if (indexpoint == 0) {
                if (s.charAt(indexe+1) == '+' || s.charAt(indexe+1) == '-') {
                    return isnoncharNumber(s.substring(1, indexe)) && isnoncharNumber(s.substring(indexe+2));
                }
                else {
                    return isnoncharNumber(s.substring(1, indexe)) && isnoncharNumber(s.substring(indexe+1));
                }
            }
            else if (indexpoint == indexe-1) {
                if (s.charAt(indexe+1) == '+' || s.charAt(indexe+1) == '-') {
                    return isnoncharNumber(s.substring(0, indexpoint)) && isnoncharNumber(s.substring(indexe+2));
                }
                else {
                    return isnoncharNumber(s.substring(0, indexpoint)) && isnoncharNumber(s.substring(indexe+1));
                }
            }
            else {
                if (s.charAt(indexe+1) == '+' || s.charAt(indexe+1) == '-') {
                    return isnoncharNumber(s.substring(0, indexpoint)) && isnoncharNumber(s.substring(indexpoint+1, indexe)) && isnoncharNumber(s.substring(indexe+2));
                }
                else {
                    return isnoncharNumber(s.substring(0, indexpoint)) && isnoncharNumber(s.substring(indexpoint+1,indexe)) && isnoncharNumber(s.substring(indexe+1));
                }
            }
        }
    }
}
