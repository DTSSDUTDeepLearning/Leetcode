package l2000;

public class l2000 {

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(word.substring(0, index+1));
        sb.reverse();
        sb.append(word.substring(index+1));
        return sb.toString();
    }
}