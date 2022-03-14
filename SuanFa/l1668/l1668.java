package SuanFa.l1668;

public class l1668 {

    public int maxRepeating(String sequence, String word) {
        int k = 0;
        StringBuilder sb = new StringBuilder(word);
        while (sequence.contains(sb.toString())) {
            k++;
            sb.append(word);
        }
        return k;
    }
}
