package JianZhiOffer.l036;

public class l036 {

    Node pre;
    Node head;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return root;
        }
        pre = null;
        in(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void in(Node root) {
        if (root == null) {
            return;
        }
        in(root.left);
        if (pre != null) {
            pre.right = root;
        }
        else {
            head = root;
        }
        root.left = pre;
        pre = root;
        in(root.right);
    }
}
