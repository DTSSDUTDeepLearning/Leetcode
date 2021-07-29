package SuanFa.lcp001;

public class lcp001 {

    public int game(int[] guess, int[] answer) {
        int sum = 0;
        for (int i = 0;i < 3;i++) {
            sum += guess[i]==answer[i]?1:0;
        }
        return sum;
    }
}
