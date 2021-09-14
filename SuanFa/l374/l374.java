package SuanFa.l374;

class GuessGame {
    int guess(int num) {
        return num<100?-1:1;
    }
}

public class l374 extends GuessGame {

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            int a = guess(mid);
            if (a == 0) {
                return mid;
            }
            else if (a > 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }
}
