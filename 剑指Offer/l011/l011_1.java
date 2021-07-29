package JianZhiOffer.l011;

public class l011_1 {

    // 遍历，时间复杂度与二分查找一样
    public int minArray(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        for (int i = 1;i < numbers.length;i++) {
            if (numbers[i-1] > numbers[i]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }
}
