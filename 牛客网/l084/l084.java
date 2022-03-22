package NowCoder.l084;

public class l084 {

    public int nodeNum(TreeNode head) {
        if (head == null) {
            return 0;
        }
        int h = 0;
        TreeNode curr = head;
        while (curr.left != null) {
            h++;
            curr = curr.left;
        }
        int left = 1<<h;
        int right = (1<<(h+1))-1;
        while (left < right) {
            int mid = left+(right-left+1)/2;
            if (exists(head, h, mid)) {
                left = mid;
            } else {
                right = mid-1;
            }
        }
        return left;
    }

    public boolean exists(TreeNode root, int level, int k) {
        int bits = 1 << (level-1);
        TreeNode node = root;
        while (node != null && bits > 0) {
            if ((bits & k) == 0) {
                node = node.left;
            } else {
                node = node.right;
            }
            bits>>=1;
        }
        return node != null;
    }
}
