package SuanFa.l589;

import java.util.LinkedList;
import java.util.List;

public class l589 {

    List<Integer> l;

    public List<Integer> preorder(Node root) {
        l = new LinkedList<>();
        if (root == null) {
            return l;
        }
        pre(root);
        return l;
    }

    public void pre(Node root) {
        l.add(root.val);
        for (Node node : root.children) {
            pre(node);
        }
    }
}
