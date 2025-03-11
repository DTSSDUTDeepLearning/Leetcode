package l988;

import java.util.*;

public class l988 {

    String result;

    public String smallestFromLeaf(TreeNode root) {
        result = "~";
        dfs(root, new StringBuilder());
        return result;
    }

    public void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        sb.append((char)('a' + node.val));
        if (node.left == null && node.right == null) {
            sb.reverse();
            if (sb.toString().compareTo(result) < 0) {
                result = sb.toString();
            }
            sb.reverse();
        }
        dfs(node.left, sb);
        dfs(node.right, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
