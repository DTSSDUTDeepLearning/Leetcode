package l116;

public class l116 {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Node levelLeft = root;
        while (levelLeft.left != null) {
            Node curr = levelLeft;
            while (curr != null) {
                curr.left.next = curr.right;
                if (curr.next != null) {
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            levelLeft = levelLeft.left;
        }
        return root;
    }
}
