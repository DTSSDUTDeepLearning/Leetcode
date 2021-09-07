package SuanFa.l071;

import java.util.Deque;
import java.util.LinkedList;

public class l071 {

    public String simplifyPath(String path) {
        String[] dir_list = path.split("/");
        Deque<String> deque = new LinkedList<>();
        for (String dir : dir_list) {
            if (!dir.equals("") && !dir.equals(".") & !dir.equals("..")) {
                deque.push(dir);
            }
            else if (dir.equals("..") && !deque.isEmpty()){
                deque.pop();
            }
        }
        if (deque.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append('/');
            sb.append(deque.pollLast());
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        l071 l = new l071();
        String s1 = "/home/";
        String s2 = "/../";
        String s3 = "/home//foo/";
        String s4 = "/a/./b/../../c/";
        String s5 = "/a//b////c/d//././/..";
        String s6 = "/a//b////c/d//././/.";
        String s7 = "/a//b////c/d//././/...";
        String s8 = "/..";
        String s9 = "/.hidden";
        System.out.println(l.simplifyPath(s1));
        System.out.println(l.simplifyPath(s2));
        System.out.println(l.simplifyPath(s3));
        System.out.println(l.simplifyPath(s4));
        System.out.println(l.simplifyPath(s5));
        System.out.println(l.simplifyPath(s6));
        System.out.println(l.simplifyPath(s7));
        System.out.println(l.simplifyPath(s8));
        System.out.println(l.simplifyPath(s9));
    }
}
