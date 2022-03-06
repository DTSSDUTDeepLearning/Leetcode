package SuanFa.l1003;

public class l1003_1 {

    // 不断消去字符串中的abc，用字符串进行消去
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        int index = sb.indexOf("abc");
        while (index != -1) {
            StringBuilder new_sb = new StringBuilder(sb.substring(0, index));
            new_sb.append(sb.substring(index+3));
            sb = new_sb;
            index = sb.indexOf("abc");
        }
        return sb.toString().equals("");
    }
}
