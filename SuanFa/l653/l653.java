package SuanFa.l653;

import SuanFa.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class l653 {

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> l = new ArrayList<>();
        inorder(root, l);
        int left = 0;
        int right = l.size()-1;
        while (left < right) {
            int sum = l.get(left) + l.get(right);
            if (sum == k) {
                return true;
            }
            else if (sum < k) {
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }

    public static void inorder(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        inorder(root.left, l);
        l.add(root.val);
        inorder(root.right, l);
    }
}
