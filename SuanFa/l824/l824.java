package SuanFa.l824;

public class l824 {

    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        int len = words.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < len;i++) {
            String word = words[i];
            char c = word.charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                sb.append(word);
            }
            else {
                sb.append(word.substring(1));
                sb.append(c);
            }
            sb.append("ma");
            for (int j = 0;j <= i;j++) {
                sb.append('a');
            }
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
