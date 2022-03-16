package SuanFa.l1859;

public class l1859 {

    public String sortSentence(String s) {
        String[] noise_words = s.split(" ");
        int len = noise_words.length;
        String[] words = new String[len];
        for (int i = 0;i < len;i++) {
            int size = noise_words[i].length();
            words[noise_words[i].charAt(size-1)] = noise_words[i].substring(0, size-1);
        }
        StringBuilder sb = new StringBuilder(words[0]);
        for (int i = 1;i < len;i++) {
            sb.append(' ');
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
