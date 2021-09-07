package SuanFa.l069;

public class l069_2 {

    // 二分查找，参考评论中Noble Monster的做法
    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int left = 0;
        int right = x;
        int mid = (left + right) / 2;
        while (left < right-1) {
            if (x / mid < mid) {
                right = mid;
            }
            else {
                left = mid;
            }
            mid = (left + right) / 2;
        }
        return mid;
    }

    public static void main(String[] args) {
        int x1 = 4;
        int x2 = 8;
        int x3 = 2147395600;
        System.out.println(mySqrt(x1));
        System.out.println(mySqrt(x2));
        System.out.println(mySqrt(x3));
    }
}
