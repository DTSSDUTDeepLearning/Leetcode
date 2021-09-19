package SuanFa.l605;

public class l605 {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        int len = flowerbed.length;
        if (len == 1) {
            cnt = (flowerbed[0]==1)?0:1;
            return cnt >= n;
        }
        int left = 0;
        while (left < len && flowerbed[left] == 0) {
            left++;
        }
        if (left == len) {
            return (len+1)/2 >= n;
        }
        cnt+=left/2;
        for (int i = left+1;i < len;i++) {
            if (flowerbed[i] == 1) {
                if ((i-left)>3) {
                    cnt += (i-left-2)/2;
                }
                left = i;
            }
        }
        cnt += (len-left-1)/2;
        return cnt >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed1 = {1,0,0,0,1};
        int n1 = 1;
        int[] flowerbed2 = flowerbed1;
        int n2 = 2;
        int[] flowerbed3 = {1,0,0,0,0,1};
        int n3 = 2;
        int[] flowerbed4 = {0,0,0};
        int n4 = 2;
        int[] flowerbed5 = {0,0,0,0};
        int n5 = 3;
        int[] flowerbed6 = {0,0};
        int n6 = 2;
        System.out.println(canPlaceFlowers(flowerbed1, n1));
        System.out.println(canPlaceFlowers(flowerbed2, n2));
        System.out.println(canPlaceFlowers(flowerbed3, n3));
        System.out.println(canPlaceFlowers(flowerbed4, n4));
        System.out.println(canPlaceFlowers(flowerbed5, n5));
        System.out.println(canPlaceFlowers(flowerbed6, n6));
    }
}
