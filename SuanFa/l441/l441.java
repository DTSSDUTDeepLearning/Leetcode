package SuanFa.l441;

public class l441 {

    public static int arrangeCoins(int n) {
        int i = (int)(Math.sqrt(n)*Math.sqrt(2));
        while (true) {
            int x;
            if (i % 2 == 0) {
                x = i/2*(i+1);
            }
            else {
                x = (i+1)/2*i;
            }
            if (x <= n) {
                return i;
            }
            else {
                i--;
            }
        }
    }

    public static void main(String[] args) {
//        for (int i = 2;i <= 10;i++) {
//            System.out.println(i+" : "+arrangeCoins(i));
//        }
        int n1 = 1804289383;
        int n2 = 5000;
        System.out.println(arrangeCoins(n1));
        System.out.println(arrangeCoins(n2));
    }
}
