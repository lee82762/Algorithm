package 위클리챌린지.이주차;

class Solution {
    public String solution(int[][] scores) {
        String answer="";

        for(int i=0; i<scores.length; i++){
            int temp=0;
            for(int j=0; j<scores[i].length; j++){
                if(i==j){
                    temp=scores[j][i];
                    break;
                }
            }
            int max=0;
            int min=100;
            for(int j=0; j<scores[i].length; j++){
                max=Math.max(max,scores[j][i]);
                min=Math.min(min,scores[j][i]);
            }
            int cnt=0;
            int cnt1=0;
            for(int j=0; j<scores[i].length; j++){
                if(max==scores[j][i]){
                    cnt++;
                }
                if(min==scores[j][i]){
                    cnt1++;
                }
            }
            int sum=0;
            double avg=0.0;
            if((max==temp&&cnt==1)||(min==temp&&cnt1==1)){

                for(int j=0; j<scores[i].length; j++){
                    if(i==j){
                        continue;
                    }
                    else{
                        sum+=scores[j][i];
                    }
                }

                avg=sum/(double)(scores.length-1);
            }
            else{
                for(int j=0; j<scores[i].length; j++){
                    sum+=scores[j][i];
                }
                avg=sum/(double)scores.length;

            }


            if(avg>=90.0){
                answer+="A";
            }
            else if(avg>=80.0&&avg<90.0){
                answer+="B";
            }
            else if(avg>=70.0&&avg<80.0){
                answer+="C";
            }
            else if(avg>=50.0&&avg<70.0){
                answer+="D";
            }
            else if(avg<50.0){
                answer+="F";
            }

        }
        return answer;
    }
}
