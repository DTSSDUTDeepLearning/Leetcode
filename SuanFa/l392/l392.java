package SuanFa.l392;

public class l392 {

    public static boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if (len1 == 0) {
            return true;
        }
        if (len2 == 0) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < len1) {
            char si = s.charAt(i);
            while (j < len2 && t.charAt(j) != si) {
                j++;
            }
            if (j == len2) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String t1 = "ahbgdc";
        String s2 = "acb";
        String t2 = "ahbgdc";
        String s3 = "axc";
        String t3 = "ahbgdc";
        String s4 = "aaaaaa";
        String t4 = "bbaaaa";
        System.out.println(isSubsequence(s1, t1));
        System.out.println(isSubsequence(s2, t2));
        System.out.println(isSubsequence(s3, t3));
        System.out.println(isSubsequence(s4, t4));
    }
}
