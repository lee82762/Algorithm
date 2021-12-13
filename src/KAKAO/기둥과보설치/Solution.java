package KAKAO.기둥과보설치;
class Solution {
    static boolean pillar[][];
    static boolean bar[][];
    public int[][] solution(int n, int[][] build_frame) {
        pillar = new boolean[n + 1][n + 1];
        bar = new boolean[n + 1][n + 1];
        int count = 0;
        for(int i = 0; i < build_frame.length; i++) {
            int x = build_frame[i][0];
            int y = build_frame[i][1];
            int type = build_frame[i][2];
            int action = build_frame[i][3];

            if(type == 0) { //기둥을
                if(action == 1) { //설치한다
                    if(inpcheck(x, y)) {
                        pillar[x][y] = true;
                        count++;
                    }
                } else { //삭제한다
                    pillar[x][y] = false;
                    if(delcheck(n) == false) pillar[x][y] = true;
                    else count--;
                }
            } else { //보를
                if(action == 1) {
                    if(inbcheck(x, y)) { //설치한다
                        bar[x][y] = true;
                        count++;
                    }
                } else { //삭제한다
                    bar[x][y] = false;
                    if(delcheck(n) == false) bar[x][y] = true;
                    else count--;
                }
            }
        }

        int[][] answer = new int[count][3];
        int idx = 0;
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                if(pillar[i][j]) {
                    answer[idx][0] = i;
                    answer[idx][1] = j;
                    answer[idx++][2] = 0;
                }
                if(bar[i][j]) {
                    answer[idx][0] = i;
                    answer[idx][1] = j;
                    answer[idx++][2] = 1;
                }
            }
        }
        return answer;
    }
    static boolean delcheck(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(pillar[i][j] && inpcheck(i,j)==false) return false;
                else if(bar[i][j] && inbcheck(i,j)==false) return false;
            }
        }
        return true;
    }
    static boolean inpcheck(int x,int y){
        if(y==0){
            return true;
        }
        else if(y > 0 && pillar[x][y-1]){
            return true;
        }
        else if(x > 0 && bar[x - 1][y] || bar[x][y]){
            return true;
        }
        return false;
    }
    static boolean inbcheck(int x, int y){
        if( y > 0 && pillar[x][y-1] || pillar[x+1][y-1]){
            return  true;
        }
        else if( x > 0 && bar[x-1][y] && bar[x+1][y]){
            return true;
        }
        return false;
    }
}
