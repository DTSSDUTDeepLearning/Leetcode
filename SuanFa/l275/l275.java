package SuanFa.l275;

public class l275 {

    public static int hIndex(int[] citations) {
        int len = citations.length;
        int left = 0;
        int right = len-1;
        int mid = (left+right)/2;
        while (left <= right) {
            if (citations[mid] == len-mid) {
                return len-mid;
            }
            else if (citations[mid] < len-mid) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
            mid = (left+right)/2;
        }
        return len-left;
    }

    public static void main(String[] args) {
        int[] citations = {0,1,3,5,6};
        System.out.println(hIndex(citations));
    }
}
