package 월간코드챌린지.방문길이;

class Solution {
    //4차원 boolean배열을 사용
    public int solution(String dirs) {


        int dx[]={1,-1,0,0};
        int dy[]={0,0,1,-1};

        boolean visit[][][][]=new boolean[11][11][11][11];
        int cnt=0;
        int i=5;
        int j=5;
        int xi=5;
        int yj=5;

        for(int k=0; k<dirs.length(); k++){
            char c=dirs.charAt(k);
            i=xi;
            j=yj;

            if(c=='U'){
                xi=i+dx[2];
                yj=j+dy[2];

            }
            else if(c=='D'){
                xi=i+dx[3];
                yj=j+dy[3];

            }
            else if(c=='L'){
                xi=i+dx[1];
                yj=j+dy[1];

            }
            else if(c=='R') {
                xi=i+dx[0];
                yj=j+dy[0];
            }

            if(xi<0||xi>10||yj<0||yj>10){
                xi=i;
                yj=j;
                continue;
            }

            if(!visit[i][j][xi][yj]){
                visit[i][j][xi][yj]=true;
                visit[xi][yj][i][j]=true;
                cnt++;
            }
        }
        return cnt;
    }
}
