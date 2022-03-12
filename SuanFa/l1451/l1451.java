package SuanFa.l1451;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class l1451 {

    public String arrangeWords(String text) {
        String[] words = text.split(" ");
        int len = words.length;
        List<Word_index> l = new LinkedList<>();
        for (int i = 0;i < len;i++) {
            Word_index wi = new Word_index(words[i].toLowerCase(), i);
            l.add(wi);
        }
        Collections.sort(l, new Comparator<Word_index>() {
            @Override
            public int compare(Word_index o1, Word_index o2) {
                if (o1.word_len != o2.word_len) {
                    return o1.word_len-o2.word_len;
                }
                else {
                    return o1.index-o2.index;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        String s = l.get(0).word;
        sb.append((char)(s.charAt(0)-32));
        sb.append(s.substring(1));
        for (int i = 1;i < len;i++) {
            sb.append(' ');
            sb.append(l.get(i).word);
        }
        return sb.toString();
    }
}

class Word_index{
    String word;
    int index;
    int word_len;
    public Word_index(String word, int index) {
        this.word = word;
        this.index = index;
        this.word_len = word.length();
    }
}