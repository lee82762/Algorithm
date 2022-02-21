package KAKAO.거리두기확인하기;

class Last {
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static boolean visit[][];
    public int[] solution(String[][] places) {
        int answer[]=new int[places.length];
        for(int i=0; i<places.length; i++){
            String map[][]=new String[5][5];
            for(int j=0; j<places[i].length; j++){
                String tm[]=places[i][j].split("");
                for(int k=0; k<tm.length; k++){
                    map[j][k]=tm[k];
                }
            }
            visit=new boolean[5][5];
            boolean check=true;
            for(int x=0; x<map.length; x++){
                for(int y=0; y<map.length; y++){
                    if(visit[x][y]==false && map[x][y].equals("P")){
                        if(bfs(map,x,y)==false){
                            check=false;
                            break;
                        }
                    }
                }
                if(check==false){
                    break;
                }
            }
            if(check==false){
                answer[i]=0;
            }
            else{
                answer[i]=1;
            }
        }
        return answer;
    }
    static public boolean bfs(String map[][],int x, int y){
        visit[x][y]=true;
        for(int i=0; i<4; i++){
            int x1=x+dx[i];
            int y1=y+dy[i];

            if(x1>=0 && x1<5 &&y1>=0 && y1<5){
                if(visit[x1][y1]==false && map[x1][y1].equals("P")){
                    visit[x1][y1]=true;
                    return false;
                }
                else if(visit[x1][y1]==false && map[x1][y1].equals("O")){
                    for(int j=0; j<4; j++){
                        int x2=x1+dx[j];
                        int y2=y1+dy[j];
                        if(x2>=0 && x2<5 && y2>=0 && y2<5){
                            if(visit[x2][y2]==false && map[x2][y2].equals("P")){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
