package KAKAO.거리두기확인하기;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int[] solution(String[][] places) {
        int result[]=new int[places.length];
        for(int i=0; i<places.length; i++){
            String [][]map=new String[5][5];
            visit=new boolean[5][5];
            for(int j=0; j<places[i].length; j++){
                String s[]=places[i][j].split("");
                for(int k=0; k<s.length; k++){
                    map[j][k]=s[k];
                }

            }
            int answer=1;
            for(int x=0; x<map.length; x++){
                boolean check=true;
                for(int y=0; y<map[i].length; y++){
                    //사람이 있을때 bfs돌기
                    if(visit[x][y]==false&&map[x][y].equals("P")){
                        int cnt= bfs(x,y,map);
                        if(cnt==0){
                            answer=0;
                            check=false;
                            break;
                        }
                    }
                }
                if(check==false){
                    break;
                }
            }
            result[i]=answer;

        }
        return result;
    }
    static int bfs(int x,int y,String map[][]){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y));
        visit[x][y]=true;


        Pair p1=queue.poll();
        int x1=p1.x;
        int y1=p1.y;
        for(int i=0; i<4; i++){
            int x2=x1+dx[i];
            int y2=y1+dy[i];
            if(x2>=0&&x2<5&&y2>=0&&y2<5){
                //상하좌우 돌아 "X"가아니고 "P"이면 규칙 위반
                if(visit[x2][y2]==false&&!map[x2][y2].equals("X")){
                    if(map[x2][y2].equals("P")){
                        visit[x2][y2]=true;
                        return 0;
                    }
                    //"O"이면 상하좌우 한번더돌아 "P"이면 규칙위반
                    else if(map[x2][y2].equals("O")){
                        for(int j=0; j<4; j++){
                            int x3=x2+dx[j];
                            int y3=y2+dy[j];
                            if(x3>=0&&x3<5&&y3>=0&&y3<5){
                                if(visit[x3][y3]==false&&!map[x3][y3].equals("X")){
                                    if(map[x3][y3].equals("P")){
                                        visit[x3][y3]=true;
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }




        }
        return 1;
    }
}
