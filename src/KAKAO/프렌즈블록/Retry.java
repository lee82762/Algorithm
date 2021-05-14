package KAKAO.프렌즈블록;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Retry{

    static String map[][];
    static int dx[]={1,0,1};
    static int dy[]={0,1,1};

    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    static Queue<Pair>queue=new LinkedList<>();
    static  int answer=0;
    static ArrayList<String>s1=new ArrayList<>();
    public int solution(int m, int n, String[] board) {

        map=new String[m][n];


        for (int i = 0; i < board.length; i++) {
            String s = board[i];
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                map[i][j] = String.valueOf(c);
            }
        }



        while (true) {

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j].equals("0"))
                        continue;
                    bfs(i, j, m, n, map);
                }
            }


            change(map);
            if(s1.size()==0){
                break;
            }
            answer+=s1.size();
            s1.clear();





        }
        return answer;
    }
    static public void bfs(int x, int y,int m, int n, String [][]map){
        Queue<Pair>queue1=new LinkedList<>();
        queue1.add(new Pair(x,y));
        String s=map[x][y];

        Pair p1=queue1.poll();
        int x1=p1.x;
        int y1=p1.y;

        for(int i=0; i<3; i++){
            int x2=x1+dx[i];
            int y2=y1+dy[i];

            if(x2>=0&&x2<m&&y2>=0&&y2<n){

                if(s.equals(map[x2][y2])){
                    queue1.add(new Pair(x2,y2));
                }
            }
        }

        if(queue1.size()==3){
            queue.add(new Pair(x,y));
            if(!s1.contains(Integer.toString(x)+" "+Integer.toString(y))) {
                s1.add(Integer.toString(x) + " " + Integer.toString(y));
            }

            while (!queue1.isEmpty()){
                Pair p2=queue1.poll();
                int x2=p2.x;
                int y2=p2.y;
                if(!s1.contains(Integer.toString(x2)+" "+Integer.toString(y2))){
                    s1.add(Integer.toString(x2)+" "+Integer.toString(y2));
                }
            }
        }
    }


    static public void change(String [][]map){
        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x=p1.x;
            int y=p1.y;

            map[x][y]="0";

            for(int i=0; i<3; i++){
                int x2=x+dx[i];
                int y2=y+dy[i];
                map[x2][y2]="0";

            }

        }

        for(int k=0; k<map.length; k++) {
            for (int i = 1; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if(map[i][j].equals("0")){
                        map[i][j]=map[i-1][j];
                        map[i-1][j]="0";
                    }

                }
            }
        }

    }
}
