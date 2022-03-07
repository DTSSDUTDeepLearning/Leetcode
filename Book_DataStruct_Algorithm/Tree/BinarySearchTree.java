package Book_DataStruct_Algorithm.Tree;

import java.util.Arrays;

public class BinarySearchTree {

    public static void main(String[] args) {
        System.out.println("开始从头构建二叉搜索树、向二叉搜索树中插入结点、从二叉搜索树中删除结点");
        System.out.println("开始构造二叉搜索树");
        TreeNode head = new TreeNode(400);
        System.out.println("根结点400构造成功");
        System.out.println("向二叉搜索树中插入结点122");
        insert(head, 122);
        System.out.println("向二叉搜索树中插入结点450");
        insert(head, 450);
        System.out.println("向二叉搜索树中插入结点99");
        insert(head, 99);
        System.out.println("向二叉搜索树中插入结点250");
        insert(head, 250);
        System.out.println("向二叉搜索树中插入结点500");
        insert(head, 500);
        System.out.println("使用带空结点的BFS方法遍历二叉搜索树：");
        System.out.println(Arrays.toString(BFS.BFS_with_null(head)));
        System.out.println("向二叉搜索树中插入结点110");
        insert(head, 110);
        System.out.println("向二叉搜索树中插入结点200");
        insert(head, 200);
        System.out.println("向二叉搜索树中插入结点300");
        insert(head, 300);
        System.out.println("向二叉搜索树中插入结点105");
        insert(head, 105);
        System.out.println("向二叉搜索树中插入结点330");
        insert(head, 330);
        System.out.println("使用带空结点的BFS方法遍历二叉搜索树：");
        System.out.println(Arrays.toString(BFS.BFS_with_null(head)));

//        System.out.println("使用合并删除");
//        System.out.println("使用复制删除1");
        System.out.println("使用复制删除2");
        System.out.println("从二叉搜索树中删除结点122");
        remove(head, 122);
        System.out.println("使用带空结点的BFS方法遍历二叉搜索树：");
        System.out.println(Arrays.toString(BFS.BFS_with_null(head)));
        System.out.println("从二叉搜索树中删除结点105");
        remove(head, 105);
        System.out.println("使用带空结点的BFS方法遍历二叉搜索树：");
        System.out.println(Arrays.toString(BFS.BFS_with_null(head)));
        System.out.println("从二叉搜索树中删除结点99");
        remove(head, 99);
        System.out.println("使用带空结点的BFS方法遍历二叉搜索树：");
        System.out.println(Arrays.toString(BFS.BFS_with_null(head)));
        System.out.println("从二叉搜索树中删除结点500");
        remove(head, 500);
        System.out.println("使用带空结点的BFS方法遍历二叉搜索树：");
        System.out.println(Arrays.toString(BFS.BFS_with_null(head)));
        System.out.println("从二叉搜索树中删除结点250");
        remove(head, 250);
        System.out.println("使用带空结点的BFS方法遍历二叉搜索树：");
        System.out.println(Arrays.toString(BFS.BFS_with_null(head)));

        System.out.println("在二叉搜索树中搜索300：");
        if (search(head, 300)) {
            System.out.println("找到了该结点");
        }
        else {
            System.out.println("不存在该结点");
        }
        System.out.println("在二叉搜索树中搜索238");
        if (search(head, 238)) {
            System.out.println("找到了该结点");
        }
        else {
            System.out.println("不存在该结点");
        }

    }

    public static boolean search(TreeNode root, int x) {
        TreeNode node = root;
        while (node != null) {
            if (node.val == x) {
                return true;
            }
            else if (node.val < x) {
                node = node.right;
            }
            else {
                node = node.left;
            }
        }
        return false;
    }

    public static void insert(TreeNode root, int x) {
        TreeNode node = root;
        while (true) {
            if (node.val < x) {
                if (node.right == null) {
                    node.right = new TreeNode(x);
                    return;
                }
                else {
                    node = node.right;
                }
            }
            else if (node.val > x) {
                if (node.left == null) {
                    node.left = new TreeNode(x);
                    return;
                }
                else {
                    node = node.left;
                }
            }
            else {
                System.out.println("待插入的结点已经存在于二叉搜索树中");
                return;
            }
        }
    }

    public static void remove(TreeNode root, int x) {
        if (!search(root, x)) {
            System.out.println("该结点不存在，无法删除");
        }
        else {
            TreeNode node = root;
            TreeNode prev = null;
            boolean flag = true;
            while (node.val != x) {
                prev = node;
                if (node.val < x) {
                    node = node.right;
                    flag = false;
                }
                else {
                    node = node.left;
                    flag = true;
                }
            }
            if (node.left == null && node.right == null) {
                if (flag) {
                    prev.left = null;
                }
                else {
                    prev.right = null;
                }
            }
            else if (node.left == null ^ node.right == null) {
                if (node.left == null) {
                    if (flag) {
                        prev.left = node.right;
                    }
                    else {
                        prev.right = node.right;
                    }
                }
                else {
                    if (flag) {
                        prev.left = node.left;
                    }
                    else {
                        prev.right = node.left;
                    }
                }
            }
            else {
                // 合并删除
//                deleteByMerging(prev, flag, node);
                // 复制删除1，选取左边最大的
//                deleteByCopying1(prev, flag, node);
                // 复制删除2，选取右边最小的
                deleteByCopying2(prev, flag, node);
            }
        }
    }

    public static void deleteByMerging(TreeNode prev, boolean flag, TreeNode node) {
        if (flag) {
            prev.left = node.left;
        }
        else {
            prev.right = node.left;
        }
        TreeNode tmp = node.right;
        node = node.left;
        while (node.right != null) {
            node = node.right;
        }
        node.right = tmp;
    }

    public static void deleteByCopying1(TreeNode prev, boolean flag, TreeNode node) {
        TreeNode tmp = node.left;
        if (tmp.right == null) {
            tmp.right = node.right;
            if (flag) {
                prev.left = tmp;
            }
            else {
                prev.right = tmp;
            }
            return;
        }
        while (tmp.right.right != null) {
            tmp = tmp.right;
        }
        node.val = tmp.right.val;
        tmp.right = tmp.right.left;
    }

    public static void deleteByCopying2(TreeNode prev, boolean flag, TreeNode node) {
        TreeNode tmp = node.right;
        if (tmp.left == null) {
            tmp.left = node.left;
            if (flag) {
                prev.left = tmp;
            }
            else {
                prev.right = tmp;
            }
            return;
        }
        while (tmp.left.left != null) {
            tmp = tmp.left;
        }
        node.val = tmp.left.val;
        tmp.left = tmp.left.right;
    }
}
