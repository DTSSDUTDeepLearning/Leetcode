package SuanFa.l1208;

public class l1208 {

    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int right = 0;
        int longest = 0;
        int sum = 0;
        int len = s.length();
        int[] sub = new int[len];
        for (int i = 0;i < len;i++) {
            sub[i] = Math.abs(s.charAt(i)-t.charAt(i));
        }
        while (right < len) {
            sum+=sub[right];
            while (sum > maxCost) {
                sum -= sub[left++];
            }
            if (longest < right-left+1) {
                longest = right-left+1;
            }
            right++;
        }
        return longest;
    }
}
