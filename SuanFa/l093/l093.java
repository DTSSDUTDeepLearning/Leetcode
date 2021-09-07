package SuanFa.l093;

import java.util.LinkedList;
import java.util.List;

public class l093 {

    List<String> ans = new LinkedList<>();
    int[] ip;

    public List<String> restoreIpAddresses(String s) {
        ip = new int[4];
        dfs(s, 0, 0);
        return ans;
    }

    public void dfs(String s, int segId, int segStart) {
        // 如果找到了 4 段 IP 地址并且遍历完了字符串，那么就是一种答案
        if (segId == 4) {
            if (segStart == s.length()) {
                StringBuffer ipAddr = new StringBuffer();
                for (int i = 0; i < 4; ++i) {
                    ipAddr.append(ip[i]);
                    if (i != 3) {
                        ipAddr.append('.');
                    }
                }
                ans.add(ipAddr.toString());
            }
            return;
        }

        // 如果还没有找到 4 段 IP 地址就已经遍历完了字符串，那么提前回溯
        if (segStart == s.length()) {
            return;
        }

        // 由于不能有前导零，如果当前数字为 0，那么这一段 IP 地址只能为 0
        if (s.charAt(segStart) == '0') {
            ip[segId] = 0;
            dfs(s, segId + 1, segStart + 1);
        }

        // 一般情况，枚举每一种可能性并递归
        int addr = 0;
        for (int segEnd = segStart; segEnd < s.length(); ++segEnd) {
            addr = addr * 10 + (s.charAt(segEnd) - '0');
            if (addr > 0 && addr <= 0xFF) {
                ip[segId] = addr;
                dfs(s, segId + 1, segEnd + 1);
            } else {
                break;
            }
        }
    }

}
