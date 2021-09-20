package SuanFa.l654;

import SuanFa.TreeNode;

public class l654 {

    int[] nums;

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        this.nums = nums;
        return build(0, nums.length);
    }

    public TreeNode build(int left, int right) {
        if (left == right) {
            return null;
        }
        int max_index = find_max_index(left, right);
        return new TreeNode(nums[max_index], build(left, max_index), build(max_index+1, right));
    }

    public int find_max_index(int left, int right) {
        int max_index = left;
        for (int i = left+1;i < right;i++) {
            if (nums[max_index] < nums[i]) {
                max_index = i;
            }
        }
        return max_index;
    }
}
