package 연습문제.문자열다루기기본;

class Solution {
    public boolean solution(String s) {
        int a=s.length();
        boolean answer=true;
        int cnt=0;
        if(a==4||a==6){
            for(int i=0; i<s.length(); i++){
                char c=s.charAt(i);
                if(!Character.isDigit(c)){
                    cnt++;
                }
            }
            if(cnt!=0){
                answer=false;
            }
        }
        else{
            answer=false;
        }

        return answer;
    }
}
