package SuanFa.l1455;

public class l1455 {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int len = words.length;
        for (int i = 0;i < len;i++) {
            if (words[i].indexOf(searchWord) == 0) {
                return i+1;
            }
        }
        return -1;
    }
}
