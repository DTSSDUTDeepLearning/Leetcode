package SuanFa.l005;

public class l005_1 {

    public static String longestPalindrome(String s) {
        boolean[][] p = new boolean[s.length()][s.length()];
        String result = "";
        for (int l = 0;l < s.length();l++) {
            for (int i = 0;i+l < s.length();i++) {
                int j = i+l;
                if (l==0) {
                    p[i][j] = true;
                } else if (l==1) {
                    p[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    p[i][j] = (s.charAt(i) == s.charAt(j)) && p[i+1][j-1];
                }
                if (p[i][j] && l+1 > result.length()) {
                    result = s.substring(i, j+1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "babad";
        String s2 = "cbbd";
        System.out.println(longestPalindrome(s1));
        System.out.println(longestPalindrome(s2));
    }
}
