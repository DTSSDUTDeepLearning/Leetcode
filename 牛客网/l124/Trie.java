package NowCoder.l124;

public class Trie {
    Trie children[];
    int word_num = 0;
    int prefix_num = 0;
    boolean isWord = false;
    public Trie(){
        this.children = new Trie[26];
    }
}
