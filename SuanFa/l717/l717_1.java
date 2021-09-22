package SuanFa.l717;

public class l717_1 {

    // 使用线性扫描法
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int len = bits.length-1;
        while (i < len) {
            i += (bits[i]+1);
        }
        return i == len;
    }
}
