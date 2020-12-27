package 월간코드챌린지.삼각달팽이;

import java.util.ArrayList;
class Retry {
    public int[] solution(int n) {
        int re[][]=new int[n][n];
        int i=-1;
        int j=0;
        int cnt=0;
        while (true) {
            for (int a = 0; a < n; a++) {
                cnt++;
                i += 1;
                re[i][j] = cnt;
            }
            n--;
            if(n==0){
                break;
            }
            for (int a = 0; a < n; a++) {
                cnt++;
                j++;
                re[i][j] = cnt;
            }
            n--;
            if(n==0){
                break;
            }
            for (int a = 0; a < n; a++) {
                cnt++;
                i--;
                j--;

                re[i][j] = cnt;
            }
            n--;
            if(n==0){
                break;
            }
        }
        ArrayList<Integer>a1=new ArrayList<>();




        for(int a=0; a<re.length; a++){
            for(int b=0; b<re[0].length; b++){
                if(re[a][b]==0){
                    continue;
                }
                else{
                    a1.add(re[a][b]);
                }
            }
        }
        int answer[]=new int [a1.size()];
        for(int a=0; a<a1.size();a++){
            answer[a]=a1.get(a);
        }
        return answer;
    }
}