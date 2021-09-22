package SuanFa.l744;

public class l744_1 {

    //线性搜索
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            if (c > target) {
                return c;
            }
        }
        return letters[0];
    }
}
