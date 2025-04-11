package l2255;

public class l2255 {

    public int countPrefixes(String[] words, String s) {
        int sum = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                sum++;
            }
        }
        return sum;
    }
}
