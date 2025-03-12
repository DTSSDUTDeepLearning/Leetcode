package l3270;

public class l3270 {

    public int generateKey(int num1, int num2, int num3) {
        int result = 0;
        for (int k = 1;num1 > 0 && num2 > 0 && num3 > 0;k *= 10) {
            result += Math.min(Math.min(num1 % 10, num2 % 10), num3 % 10) * k;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
        }
        return result;
    }
}