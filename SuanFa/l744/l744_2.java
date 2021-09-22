package SuanFa.l744;

public class l744_2 {

    //二分搜索
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length;
        while (left < right) {
            int mi = left + (right - left) / 2;
            if (letters[mi] <= target) {
                left = mi + 1;
            }
            else {
                right = mi;
            }
        }
        return letters[left % letters.length];
    }
}
