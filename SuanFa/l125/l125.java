package SuanFa.l125;

public class l125 {

    public static boolean ischarnum(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static char lower(char c) {
        if (c >= 'A' && c <= 'Z') {
            c+=32;
        }
        return c;
    }

    public static boolean isPalindrome(String s) {
        int len = s.length();
        if (len==0 || len==1) {
            return true;
        }
        int left = 0;
        int right = len-1;
        while (true) {
            while (left < len && !ischarnum(s.charAt(left))) {
                left++;
            }
            while (right > left && !ischarnum(s.charAt(right))) {
                right--;
            }
            if (left >= right) {
                return true;
            }
            if (lower(s.charAt(left)) != lower(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }
}
