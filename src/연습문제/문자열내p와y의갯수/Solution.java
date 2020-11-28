package 연습문제.문자열내p와y의갯수;

class Solution {
    boolean solution(String s) {

        s=s.toLowerCase();
        int cnt=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='p'){
                cnt++;
            }
            else if(c=='y'){
                cnt--;
            }

        }
        boolean answer=true;
        if(cnt!=0){
            answer=false;
        }

        return answer;
    }
}
