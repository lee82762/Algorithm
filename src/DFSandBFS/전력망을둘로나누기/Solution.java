package DFSandBFS.전력망을둘로나누기;

import java.util.LinkedList;
import java.util.Queue;
class Solution {
    //bfs 로 계산
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        int map[][]=new int[n][n];

        for(int i=0; i<wires.length; i++){
            int a=wires[i][0]-1;
            int b=wires[i][1]-1;
            map[a][b]=1;
            map[b][a]=1;
        }


        for(int j=0; j<wires.length; j++) {
            int a=wires[j][0]-1;
            int b=wires[j][1]-1;
            map[a][b]=0;
            map[b][a]=0;
            boolean  visit[] =new boolean[n];
            int one=0;
            int two=0;
            int cnt=0;
            for (int i = 0; i < n; i++) {

                if (visit[i] == false) {

                    cnt++;
                    if(cnt==1){
                        one=bfs(i,map,visit);
                    }
                    else{
                        two=bfs(i,map,visit);
                    }

                }
            }
            answer=Math.min(Math.abs(one-two),answer);
            map[a][b]=1;
            map[b][a]=1;
        }
        return answer;
    }
    public static int  bfs(int x,int map[][],boolean visit[]){
        Queue<Integer>queue=new LinkedList<>();
        int cnt=1;
        queue.add(x);
        visit[x]=true;
        while (!queue.isEmpty()){
            int x1=queue.poll();
            for(int i=0; i<map.length; i++){
                if(map[x1][i]==1&&visit[i]==false){
                    queue.add(i);
                    visit[i]=true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
