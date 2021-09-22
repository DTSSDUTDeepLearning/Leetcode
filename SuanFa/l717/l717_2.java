package SuanFa.l717;

public class l717_2 {

    // 使用贪心算法
    public boolean isOneBitCharacter(int[] bits) {
        int right = bits.length-2;
        while (right >= 0 && bits[right]==1) {
            right--;
        }
        return (bits.length - right) % 2 == 0;
    }
}
