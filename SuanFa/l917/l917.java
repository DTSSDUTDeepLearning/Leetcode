package SuanFa.l917;

public class l917 {

    public String reverseOnlyLetters(String S) {
        char[] cs = S.toCharArray();
        int left = 0;
        int right = cs.length-1;
        while (left < right) {
            while (left < right && !isChar(cs[left])) {
                left++;
            }
            while (left < right && !isChar(cs[right])) {
                right--;
            }
            if (left < right) {
                char tmp = cs[left];
                cs[left] = cs[right];
                cs[right] = tmp;
            }
            left++;
            right--;
        }
        return new String(cs);
    }

    public boolean isChar(char c) {
        if ((c>='a'&&c<='z') || (c>='A'&&c<='Z')) {
            return true;
        }
        else {
            return false;
        }
    }
}
