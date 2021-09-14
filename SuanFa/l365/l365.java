package SuanFa.l365;

public class l365 {

    public static boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        if (x == 0 || y == 0) {
            return z == 0 || x + y == z;
        }
        int gcd = x % y;
        while (gcd != 0) {
            x = y;
            y = gcd;
            gcd = x % y;
        }
        return z % y == 0;
    }

    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 5;
        int z1 = 4;
        int x2 = 2;
        int y2 = 6;
        int z2 = 5;
        System.out.println(canMeasureWater(x1, y1, z1));
        System.out.println(canMeasureWater(x2, y2, z2));
    }
}
