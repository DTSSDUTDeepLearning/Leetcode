package NowCoder.l124;

import java.util.LinkedList;
import java.util.List;

public class l124 {
    Trie root = new Trie();

    public void insert(String word){
        Trie tmp = root;
        char[] cs = word.toCharArray();
        for (char c : cs) {
            if (tmp.children[c-'a'] == null) { // 如果之前无节点
                tmp.children[c-'a'] = new Trie(); // 新建节点
            }
            tmp = tmp.children[c-'a']; // 移动指针
            tmp.prefix_num++; // 前缀加一
        }
        // 此处tmp是最后一个字母所代表的的节点
        tmp.isWord = true;
        tmp.word_num++; // 单词数量加一
    }

    public void delete(String word){
        Trie tmp = root;
        char[] cs = word.toCharArray();
        int len = cs.length;
        for (char c : cs) {
            tmp = tmp.children[c-'a']; // tmp是上一个指针，扫描到当前
            tmp.prefix_num--;// 当前位置前缀和减减
        }
        tmp.word_num--;
        if(tmp.word_num == 0){
            tmp.isWord = false;
        }
    }

    public boolean search(String word){
        Trie tmp = root;
        char[] cs = word.toCharArray();
        for (char c : cs) {
            if (tmp.children[c-'a'] == null) {
                return false; // 没有找到
            }
            tmp = tmp.children[c-'a']; //指针后移
        }
        return tmp.isWord; // 找到最后的结果
    }

    public int prefixNumber(String pre){
        Trie tmp = root;
        char[] cs = pre.toCharArray();
        for (char c : cs) {
            if (tmp.children[c-'a'] == null) {
                return 0;
            }
            tmp = tmp.children[c-'a'];
        }
        return tmp.prefix_num;
    }
    public String[] trieU (String[][] operators) {
        List<String> list = new LinkedList<>();
        for (String[] operator : operators) {
            if (operator[0].equals("1")) {
                insert(operator[1]);
            }
            else if (operator[0].equals("2")) {
                delete(operator[1]);
            }
            else if (operator[0].equals("3")) {
                boolean flag = search(operator[1]);
                if (flag) {
                    list.add("YES");
                } else {
                    list.add("NO");
                }
            }
            else if (operator[0].equals("4")) {
                int count = prefixNumber(operator[1]);
                list.add("" + count);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
