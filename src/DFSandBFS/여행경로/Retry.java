package DFSandBFS.여행경로;

import java.util.Arrays;
import java.util.Comparator;
class Retry {
    static String[] answer={};
    static boolean []visited={};
    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].equals(o2[0])) {
                    return o1[1].compareTo(o2[1]);
                }
                else
                    return o1[0].compareTo(o2[0]);

            }
        });
        visited=new boolean[tickets.length];
        answer=new String[tickets.length+1];
        answer[0] = "ICN";
        dfs(0, tickets, answer);


        return answer;
    }

    public static boolean dfs(int depth, String[][] tickets, String[] answer) {
        if(depth==tickets.length) {
            return true;
        }

        for(int i=0; i<tickets.length; i++) {
            if(!visited[i] && answer[depth].equals(tickets[i][0])){


                visited[i] = true;
                answer[depth+1] = tickets[i][1];
                if(dfs(depth+1,tickets, answer))
                    return true;
                visited[i] = false;
            }
        }
        return false;
    }
}
