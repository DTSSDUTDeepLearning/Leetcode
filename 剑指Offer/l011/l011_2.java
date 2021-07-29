package JianZhiOffer.l011;

public class l011_2 {

    // 二分查找，时间复杂度与遍历一样
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length-1;
        while (left != right) {
            int mid = (left + right) / 2;
            if (numbers[mid] < numbers[right]) {
                right = mid;
            }
            else if (numbers[mid] > numbers[right]){
                left = mid + 1;
            }
            else {
                right--;
            }
        }
        return numbers[left];
    }
}
