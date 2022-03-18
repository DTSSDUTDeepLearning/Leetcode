package SuanFa.l1954;

public class l1954 {

    public long minimumPerimeter(long neededApples) {
        long left = 1;
        long right = 100000;
        long mid = left + (right - left) / 2;
        while (left <= right) {
            if (2 * mid * (mid + 1) * (mid * 2 + 1) >= neededApples) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return 8 * left;
    }
}
