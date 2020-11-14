package 월간코드챌린지.삼각달팽이;

import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        int [][]map=new int[n][n];
        int i=-1;
        int j=0;
        int cnt=1;
        ArrayList<Integer>a1=new ArrayList<>();

        while(true){

            for(int a=0; a<n; a++){
                i+=1;
                map[i][j]=cnt;
                cnt++;
            }
            n--;
            if(n==0){
                break;
            }
            for(int a=0; a<n; a++){
                j++;
                map[i][j]=cnt;
                cnt++;
            }
            n--;
            if(n==0){
                break;
            }
            for(int a=0; a<n; a++){
                i--;
                j--;
                map[i][j]=cnt;
                cnt++;
            }
            n--;
            if(n==0){
                break;
            }

        }

        for(int a=0; a<map.length; a++){
            for(int b=0; b<map.length; b++){
                if(map[a][b]!=0){
                    a1.add(map[a][b]);
                }
            }
        }
        int answer[]=new int[a1.size()];
        for(int a=0; a<a1.size(); a++){
            answer[a]=a1.get(a);
        }
        return answer;
    }
}