package SuanFa.l434;

public class l434 {

    public static int countSegments(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int cnt = 0;
        char c_prev = s.charAt(0);
        if (c_prev != ' ') {
            cnt++;
        }
        for (int i = 1;i < len;i++) {
            char c_curr = s.charAt(i);
            if (c_prev == ' ' && c_curr != ' ') {
                cnt++;
            }
            c_prev = c_curr;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s1 = "Hello, my name is John";
        String s2 = "Hello, my name is John ";
        String s3 = "Hello, my name is  John";
        System.out.println(countSegments(s1));
        System.out.println(countSegments(s2));
        System.out.println(countSegments(s3));
    }
}
