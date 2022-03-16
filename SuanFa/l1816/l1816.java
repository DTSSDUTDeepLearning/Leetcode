package SuanFa.l1816;

public class l1816 {

    public String truncateSentence(String s, int k) {
        String[] sp = s.split(" ");
        StringBuilder sb = new StringBuilder(sp[0]);
        for (int i = 1;i < k;i++) {
            sb.append(' ');
            sb.append(sp[i]);
        }
        return sb.toString();
    }
}
