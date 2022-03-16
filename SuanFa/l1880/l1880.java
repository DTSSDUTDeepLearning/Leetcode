package SuanFa.l1880;

public class l1880 {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getNum(firstWord) + getNum(secondWord) == getNum(targetWord);
    }

    public int getNum(String s) {
        int num = 0;
        for (char c : s.toCharArray()) {
            num = num * 10 + c - 'a';
        }
        return num;
    }
}
