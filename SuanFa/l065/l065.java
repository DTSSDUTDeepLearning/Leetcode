package SuanFa.l065;

public class l065 {

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

    public static boolean isNumber(String s) {
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
        int indexe = s.indexOf("e");
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

    public static void main(String[] args) {
        String s1 = "0";
        String s2 = "0.1";
        String s3 = "abc";
        String s4 = "1a";
        String s5 = "2e10";
        String s6 = "-90e3";
        String s7 = "1e";
        String s8 = "e3";
        String s9 = "6e-1";
        String s10 = "99e2.5";
        String s11 = "53.5e93";
        String s12 = "--6 ";
        String s13 = "-+3";
        String s14 = "95a54e53";
        String s15 = "1 ";
        String s16 = " ";
        String s17 = ".1";
        String s18 = "3.";
        String s19 = "46.e3";
        String s20 = ".2e81";
        String s21 = "005047e+6";
        String s22 = "1.38354e+8";
        System.out.println(isNumber(s1));
        System.out.println(isNumber(s2));
        System.out.println(isNumber(s3));
        System.out.println(isNumber(s4));
        System.out.println(isNumber(s5));
        System.out.println(isNumber(s6));
        System.out.println(isNumber(s7));
        System.out.println(isNumber(s8));
        System.out.println(isNumber(s9));
        System.out.println(isNumber(s10));
        System.out.println(isNumber(s11));
        System.out.println(isNumber(s12));
        System.out.println(isNumber(s13));
        System.out.println(isNumber(s14));
        System.out.println(isNumber(s15));
        System.out.println(isNumber(s16));
        System.out.println(isNumber(s17));
        System.out.println(isNumber(s18));
        System.out.println(isNumber(s19));
        System.out.println(isNumber(s20));
        System.out.println(isNumber(s21));
        System.out.println(isNumber(s22));
    }

}
