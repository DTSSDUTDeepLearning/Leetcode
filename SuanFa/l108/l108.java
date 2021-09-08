package SuanFa.l108;

import SuanFa.TreeNode;

public class l108 {

    public static TreeNode sorted(int[] nums, int left, int right) {
        TreeNode root = new TreeNode();
        if (left >= right) {
             root.val = nums[left];
        }
        else if (left == right-1) {
            root.val = nums[right];
            root.left = new TreeNode(nums[left]);
        }
        else {
            int mid = (left+right)/2;
            root.val = nums[mid];
            root.left = sorted(nums, left, mid-1);
            root.right = sorted(nums, mid+1, right);
        }
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return sorted(nums, 0, nums.length-1);
    }
}
