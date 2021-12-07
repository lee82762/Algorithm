package DFSandBFS.여행경로;

import java.util.Arrays;
import java.util.*;
class Last
{
    static boolean visit[];
    public String[] solution(String[][] tikects) {
        visit=new boolean[tikects.length];
        Arrays.sort(tikects, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].equals(o2[0])){
                    return o1[1].compareTo(o2[1]);
                }
                return o1[0].compareTo(o2[0]);
            }
        });

        String answer[]=new String[tikects.length+1];
        answer[0]="ICN";
        dfs(0,tikects,answer);

        return answer;
    }

    public static boolean dfs(int depth, String[][] tickets, String[] answer) {
        if(depth==tickets.length) {
            return true;
        }

        for(int i=0; i<tickets.length; i++) {
            if(visit[i] || !answer[depth].equals(tickets[i][0]))
                continue;

            visit[i] = true;
            answer[depth+1] = tickets[i][1];
            if(dfs(depth+1,tickets, answer))
                return true;
            visit[i] = false;
        }

        return false;
    }
}
