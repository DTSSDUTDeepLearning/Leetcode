package SuanFa.l1750;

public class l1750 {

    public int minimumLength(String s) {
        char[] cs = s.toCharArray();
        int left = 0;
        int right = cs.length-1;
        while (left < right && cs[left] == cs[right]) {
            while (left < right && cs[left] == cs[left+1]) {
                left++;
            }
            while (left < right && cs[right] == cs[right-1]) {
                right--;
            }
            left++;
            right--;
        }
        return Math.max(right - left + 1, 0);
    }
}
