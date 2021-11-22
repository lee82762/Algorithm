package DFSandBFS.전력망을둘로나누기;

import java.util.LinkedList;
import java.util.Queue;
class Retry {
    public int solution(int n, int[][] wires) {
        int map[][]=new int[n][n];

        for(int i=0; i<wires.length; i++){
            int a=wires[i][0];
            int b=wires[i][1];
            map[a-1][b-1]=1;
            map[b-1][a-1]=1;
        }
        int answer=Integer.MAX_VALUE;
        for(int i=0; i<wires.length; i++){
            int a=wires[i][0];
            int b=wires[i][1];
            map[a-1][b-1]=0;
            map[b-1][a-1]=0;
            boolean visit[]=new boolean[n];
            int answer1[]=new int[2];
            int check=0;
            for(int k=0; k<map.length; k++){
                if(visit[k]==false ){

                    if(check==0){
                        answer1[check]=bfs(k,visit,map,1);
                        check++;
                    }
                    else {
                        answer1[check]=bfs(k,visit,map,1);
                    }

                }
            }

            map[a-1][b-1]=1;
            map[b-1][a-1]=1;
            answer=Math.min(Math.abs(answer1[0]-answer1[1]),answer);
        }
        return answer;
    }
    public static int  bfs(int x,boolean visit[],int [][]map, int cnt){
        Queue<Integer>qx=new LinkedList<>();
        qx.add(x);
        visit[x]=true;

        while (!qx.isEmpty()){
            int x1=qx.poll();
            for(int i=0; i<map.length; i++){
                if(map[x1][i]==1 && visit[i]==false){
                    qx.add(i);
                    visit[i]=true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
