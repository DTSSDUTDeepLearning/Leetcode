package SuanFa.l278;

//class VersionControl {
//    boolean isBadVersion(int version);
//}

class VersionControl {
    boolean isBadVersion(int version) {
        return version <= 100;
    }
}

public class l1278 extends VersionControl {
//public class l1278 {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n-1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (isBadVersion(mid)) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return left;
    }
}
