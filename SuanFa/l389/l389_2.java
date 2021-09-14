package SuanFa.l389;

public class l389_2 {

    // 位运算，异或
    public static char findTheDifference(String s, String t) {
        int ret = 0;
        int len = s.length();
        for (int i = 0;i < len;i++) {
            ret ^= s.charAt(i);
            ret ^= t.charAt(i);
        }
        ret ^= t.charAt(len);
        return (char)ret;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String t1 = "abcde";
        String s2 = "";
        String t2 = "y";
        String s3 = "a";
        String t3 = "aa";
        String s4 = "ae";
        String t4 = "aea";
        System.out.println(findTheDifference(s1, t1));
        System.out.println(findTheDifference(s2, t2));
        System.out.println(findTheDifference(s3, t3));
        System.out.println(findTheDifference(s4, t4));
    }
}
