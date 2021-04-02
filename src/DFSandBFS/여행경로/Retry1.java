package DFSandBFS.여행경로;

import java.util.Arrays;
import java.util.Comparator;
class Retry1 {
    static String[] answer={};

    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].equals(o2[0])){
                    return o1[1].compareTo(o2[1]);
                }
                return o1[1].compareTo(o2[1]);


            }
        });
        answer=new String[tickets.length+1];
        answer[0]="ICN";
        boolean visit[]=new boolean[tickets.length+1];
        dfs(tickets,visit,0,answer);
        // System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static boolean dfs(String ticket[][],boolean visit[],int dept,String []answer){
        if(dept==ticket.length){
            return true;
        }

        for(int i=0; i<ticket.length; i++){
            if(visit[i]==false&&answer[dept].equals(ticket[i][0])){

                visit[i]=true;
                answer[dept+1]=ticket[i][1];
                if(dfs(ticket,visit,dept+1,answer))
                    return true;


                visit[i]=false;
            }

        }
        return false;



    }
}
