package 월간코드챌린지.움양더하기;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {


        int answer=0;

        for(int i=0; i<absolutes.length; i++){
            if(signs[i]==true){
                answer+=absolutes[i];
            }
            else{
                answer-=absolutes[i];
            }
        }
        return answer;
    }
}