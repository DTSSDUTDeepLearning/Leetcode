package SuanFa.l344;

public class l344 {

    public void reverseString(char[] s) {
        int len = s.length;
        int left = 0;
        int right = len-1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
