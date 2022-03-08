package SuanFa.l1104;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class l1104 {

    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> node = new LinkedList<>();
        while (label != 0) {
            node.add(label);
            label /= 2;
        }
        Collections.reverse(node);
        int depth = node.size();
        if (depth % 2 == 1) {
            for (int i = 1;i < depth;i+=2) {
                node.set(i, 3 * (1 << i) - node.get(i) - 1);
            }
        }
        else {
            for (int i = 2;i < depth;i+=2) {
                node.set(i, 3 * (1 << i) - node.get(i) - 1);
            }
        }
        return node;
    }
}
