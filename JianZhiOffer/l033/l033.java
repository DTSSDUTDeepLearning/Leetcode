package JianZhiOffer.l033;

public class l033 {

    public boolean verifyPostorder(int[] postorder) {
        int len = postorder.length;
        if (len == 0) {
            return true;
        }
        return isSearch(postorder, 0, len-2, postorder[len-1]);
    }

    public boolean isSearch(int[] nums, int left, int right, int root) {
        if (left >= right) {
            return true;
        }
        int slice = left;
        while (slice <= right && nums[slice] < root) {
            slice++;
        }
        int i = slice--;
        while (i <= right && nums[i] > root) {
            i++;
        }
        if (i <= right) {
            return false;
        }
        if (slice == -1) {
            return isSearch(nums, slice+1, right-1, nums[right]);
        }
        else {
            return isSearch(nums, left, slice-1, nums[slice]) && isSearch(nums, slice+1, right-1, nums[right]);
        }
    }
}
