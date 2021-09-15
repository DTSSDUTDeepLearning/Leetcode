package SuanFa.l424;

public class l424 {

    public int characterReplacement(String s, int k) {
        int[] nums = new int[26];
        int len = s.length();
        int max = 0;
        int left = 0;
        int right = 0;
        for (;right < len;right++) {
            nums[s.charAt(right)-'A']++;
            max = Math.max(max, nums[s.charAt(right)-'A']);
            if (right-left+1-max > k) {
                nums[s.charAt(left)-'A']--;
                left++;
            }
        }
        return right-left;
    }
}
