package 코딩테스트.데브매칭2번;

import java.util.HashMap;
class Solution {
    public int solution(int n, String[] recipes, String[] orders) {
        int tm[][]=new int[n][50001];
        HashMap<String,Integer>rep=new HashMap<>();

        for(int i=0; i<recipes.length; i++){
            String s[]=recipes[i].split(" ");
            rep.put(s[0],Integer.parseInt(s[1]));
        }

        int check=0;
        int answer=0;
        for(int i=0; i<orders.length; i++){
            String s[]=orders[i].split(" ");
            String menu=s[0];
            int time=Integer.parseInt(s[1]);
            boolean check1=false;
            int min=Integer.MAX_VALUE;

            for(int j=0; j<n; j++){
                if(tm[j][check]<=time){
                    tm[j][check]=time+rep.get(menu);

                    if(i==orders.length-1){
                        answer=tm[j][check];
                    }
                    check1=true;
                    break;
                }
                min=Math.min(min,tm[j][check]);
            }
            if(check1==false){
                for(int j=0; j<n; j++){
                    if(min==tm[j][check]){
                        tm[j][check]=min+rep.get(menu);
                        if(i==orders.length-1){
                            answer=tm[j][check];
                        }
                        break;
                    }
                }
            }

        }
        return answer;
    }
}
