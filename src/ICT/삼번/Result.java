package ICT.삼번;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Result {

    /*
     * Complete the 'reachTheEnd' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING_ARRAY grid
     *  2. INTEGER maxTime
     */
    static String map[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static boolean visit[][];
    static int answer=0;
    static class Pair{
        int x;
        int y;
        int time;
        public Pair(int x, int y, int time){
            this.x=x;
            this.y=y;
            this.time=time;
        }

    }

    public static String reachTheEnd(List<String> grid, int maxTime) {
        map=new String[grid.size()][grid.get(0).length()];
        visit=new boolean[grid.size()][grid.get(0).length()];

        for(int i=0; i<grid.size(); i++){
            String s[]=grid.get(i).split("");
            for(int j=0; j<s.length; j++){
                map[i][j]=s[j];
            }
        }

        bfs(0,0);
        String result="";
        if(answer!=0){
            if(answer<=maxTime){
                result="Yes";
            }
            else{
                result="No";
            }
        }
        else{
            result="No";
        }

        return result;
        // Write your code here

    }
    static public void bfs(int x, int y){
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(x,y,1));
        visit[x][y]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int time1=p1.time;
            if(x1==map.length-1&&y1==map[0].length-1){
                answer=time1;
            }
            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                if(x2>=0&&x2<map.length&&y2>=0&&y2<map[0].length){
                    if(visit[x2][y2]==false&&!map[x2][y2].equals("#")){
                        queue.add(new Pair(x2,y2,time1+1));
                        visit[x2][y2]=true;
                    }
                }
            }
        }
    }

}
