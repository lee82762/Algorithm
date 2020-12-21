package 연습문제.수박수박수박;

class Solution {
    public String solution(int n) {
        String answer = "";
        String s="수";
        String s1="박";
        for(int i=0; i<n; i++ ){
            if(i%2==0){
                answer+=s;
            }
            else
                answer+=s1;
        }

        return answer;
    }
}