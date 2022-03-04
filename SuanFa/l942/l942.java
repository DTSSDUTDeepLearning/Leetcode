package SuanFa.l942;

public class l942 {

    public int[] diStringMatch(String S) {
        int left = 0;
        int right = S.length();
        int[] result = new int[right+1];
        int i = 0;
        for (char c : S.toCharArray()) {
            if (c == 'I') {
                result[i++] = left++;
            }
            else {
                result[i++] = right--;
            }
        }
        result[i] = left;
        return result;
    }
}
