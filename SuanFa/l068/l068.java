package SuanFa.l068;

import java.util.LinkedList;
import java.util.List;

public class l068 {

    public List<String> fullJustify(String[] words, int maxWidth) {
        int len = words.length;
        int row_len = 0;
        int row_word_num = 0;
        StringBuilder sb = new StringBuilder();
        List<String> results = new LinkedList<>();
        for (int i = 0;i < len-1;i++) {
            row_len+=words[i].length();
            row_word_num++;
            sb.append(words[i]);
            if (row_len == maxWidth) {
                row_len = 0;
                row_word_num = 0;
                results.add(sb.toString());
                sb = new StringBuilder();
            }
            else if (row_len + 1 + words[i+1].length() <= maxWidth){
                row_len++;
                sb.append(' ');
            }
            else {
                if (row_word_num == 1) {
                    int leave = maxWidth-sb.length();
                    for (int j = 0;j < leave;j++) {
                        sb.append(' ');
                    }
                }
                else {
                    int leave = maxWidth-row_len;
                    int shang = leave / (row_word_num-1);
                    int mod = leave % (row_word_num-1);
                    StringBuilder left = new StringBuilder();
                    StringBuilder right = new StringBuilder();
                    for (int j = 0;j < shang+2;j++) {
                        left.append(' ');
                    }
                    for (int j = 0;j < shang+1;j++) {
                        right.append(' ');
                    }
                    String[] strings = sb.toString().split(" ");
                    sb = new StringBuilder();
                    for (int j = 0;j < mod;j++) {
                        sb.append(strings[j]);
                        sb.append(left);
                    }
                    for (int j = mod;j < row_word_num-1;j++) {
                        sb.append(strings[j]);
                        sb.append(right);
                    }
                    sb.append(strings[row_word_num-1]);
                }
                row_len = 0;
                row_word_num = 0;
                results.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        sb.append(words[len-1]);
        for (int i = row_len+words[len-1].length();i < maxWidth;i++) {
            sb.append(' ');
        }
        results.add(sb.toString());
        return results;
    }
}
