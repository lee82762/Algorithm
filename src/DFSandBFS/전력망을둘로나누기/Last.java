package DFSandBFS.전력망을둘로나누기;

import java.util.LinkedList;
import java.util.Queue;
class Last {
    static int map[][];
    static boolean visit[];
    public int solution(int n, int[][] wires) {
        map=new int[n][n];
        visit=new boolean[n];

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
            visit=new boolean[n];
            map[a-1][b-1]=0;
            map[b-1][a-1]=0;
            answer=Math.min(answer,Math.abs(bfs(a-1)-bfs(b-1)));
            map[a-1][b-1]=1;
            map[b-1][a-1]=1;
        }
        return answer;
    }
    static public int bfs(int x){
        int cnt=1;
        Queue<Integer>queue=new LinkedList<>();
        queue.add(x);
        visit[x]=true;

        while (!queue.isEmpty()){
            int x1=queue.poll();
            for(int i=0; i<map.length; i++){
                if(visit[i]==false && map[x1][i]==1){
                    queue.add(i);
                    visit[i]=true;
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
