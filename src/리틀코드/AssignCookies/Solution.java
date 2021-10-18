package 리틀코드.AssignCookies;

import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int content = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int find = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = find; j < g.length; j++) {
                if(s[i] >= g[j]){
                    content++;
                    find = j + 1;
                    break;
                }
            }
        }

        return content;
    }
}
