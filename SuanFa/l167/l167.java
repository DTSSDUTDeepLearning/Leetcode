package SuanFa.l167;

public class l167 {

    public static int[] twoSum(int[] numbers, int target) {
        int[] results = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                results[0] = left+1;
                results[1] = right+1;
                return results;
            }
            else if (numbers[left] + numbers[right] > target) {
                right--;
            }
            else {
                left++;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] numbers1 = {2,7,11,15};
        int target1 = 9;
        int[] results1 = twoSum(numbers1, target1);
        System.out.println(results1[0]+"   "+results1[1]);
    }
}
