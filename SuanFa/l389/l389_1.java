package SuanFa.l389;

public class l389_1 {

    // 计算两个字符串的所有字符的总和，最后t的总和减去s的总和，即多出来的那个数的总和
    public static char findTheDifference(String s, String t) {
        int len = s.length();
        int m = 0;
        int n = 0;
        for (int i = 0;i < len;i++) {
            m+=s.charAt(i);
            n+=t.charAt(i);
        }
        return (char)(n+t.charAt(len)-m);
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
