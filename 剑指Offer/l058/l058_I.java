package JianZhiOffer.l058;

public class l058_I {

    public String reverseWords(String s) {
        boolean flag = true;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) != ' ') {
                flag = false;
                break;
            }
            i++;
        }
        if (flag) {
            return "";
        }
        else {
            s = s.substring(i);
        }

        int j = s.length()-1;
        while (j >= 0) {
            if (s.charAt(j) != ' ') {
                flag = false;
                break;
            }
            j--;
        }
        s = s.substring(0, j+1);

        int last = s.lastIndexOf(" ");
        if (last == -1) {
            return s;
        }
        String s1 = s.substring(last+1);
        s1 = s1.concat(" ");
        int sec = s.lastIndexOf(" ", last-1);
        while (last == sec + 1) {
            last = sec;
            sec = s.lastIndexOf(" ", last - 1);
        }
        do {
            s1 = s1.concat(s.substring(sec+1, last));
            s1 = s1.concat(" ");
            do {
                last = sec;
                sec = s.lastIndexOf(" ", last - 1);
            } while (last == sec + 1);
        } while (last != -1);

        return s1.substring(0, s1.length()-1);
    }
}
