package SuanFa.l1033;

public class l1033 {

    public int[] numMovesStones(int a, int b, int c) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (a > c) {
            int tmp = a;
            a = c;
            c = tmp;
        }
        if (b > c) {
            int tmp = b;
            b = c;
            c = tmp;
        }
        if (a == b-1 && b == c-1) {
            return new int[]{0, 0};
        }
        else if (a == b-1 || b == c-1 || a == b-2 || b == c-2) {
            return new int[]{1, c-a-2};
        }
        else {
            return new int[]{2, c-a-2};
        }
    }
}
