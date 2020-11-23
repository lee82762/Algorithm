package 월간코드챌린지.뒤집기3진법;

class Solution {
    public int solution(int n) {
        String answer1="";
        int answer=0;
        while(n!=0){
            int re=n%3;
            n=n/3;

            answer1+=Integer.toString(re);
        }

        //n진수를 10진수로 변환(3진수)
        answer=Integer.parseInt(answer1,3);
        return answer;
    }
}