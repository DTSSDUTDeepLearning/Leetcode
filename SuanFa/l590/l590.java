package SuanFa.l590;

import java.util.LinkedList;
import java.util.List;

public class l590 {

    List<Integer> l;

    public List<Integer> postorder(Node root) {
        l = new LinkedList<>();
        if (root == null) {
            return l;
        }
        post(root);
        return l;
    }

    public void post(Node root) {
        for (Node node : root.children) {
            post(node);
        }
        l.add(root.val);
    }
}
