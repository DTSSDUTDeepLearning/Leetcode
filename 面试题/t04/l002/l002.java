package MianShiTi.t04.l002;

import MianShiTi.t04.TreeNode;

public class l002 {

    int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return build(0, nums.length-1);
    }

    public TreeNode build(int left, int right) {
        if (left > right) {
            return null;
        }
        else if (left == right) {
            return new TreeNode(nums[left]);
        }
        else {
            int mid = left + (right - left) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = build(left, mid-1);
            root.right = build(mid+1, right);
            return root;
        }
    }
}
