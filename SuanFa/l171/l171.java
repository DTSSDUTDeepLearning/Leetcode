package SuanFa.l171;

public class l171 {

    public static int titleToNumber(String s) {
        int len = s.length();
        int total = 0;
        for (int i = 0;i < len;i++) {
            total += (s.charAt(len-i-1)-64)*Math.pow(26, i);
        }
        return total;
    }

    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "AB";
        String s3 = "ZY";
        System.out.println(titleToNumber(s1));
        System.out.println(titleToNumber(s2));
        System.out.println(titleToNumber(s3));
    }
}
