package l3306;

public class l3306 {

    public long countOfSubstrings(String word, int k) {
        char[] cs = word.toCharArray();
        return count(cs, k) - count(cs, k+1);
    }

    public long count(char[] cs, int k) {
        int len = cs.length;
        int[] charEnum = new int[6];
        long cnt = 0;
        int right = 0;
        for (int left = 0;left < len;left++) {
            while (right < len && (!containsAllVowel(charEnum) || charEnum[5] < k)) {
                charEnum[vowelEnum(cs[right])]++;
                right++;
            }
            if (containsAllVowel(charEnum) && charEnum[5] >= k) {
                cnt += len-right+1;
            }
            charEnum[vowelEnum(cs[left])]--;
        }
        return cnt;
    }

    private int vowelEnum(char c) {
        if (c == 'a') {
            return 0;
        }
        else if (c == 'e') {
            return 1;
        }
        else if (c == 'i') {
            return 2;
        }
        else if (c == 'o') {
            return 3;
        }
        else if (c == 'u') {
            return 4;
        }
        else {
            return 5;
        }
    }

    private boolean containsAllVowel(int[] charEnum) {
        return charEnum[0] > 0 && charEnum[1] > 0 &&
                charEnum[2] > 0 && charEnum[3] > 0 &&
                charEnum[4] > 0;
    }
}
