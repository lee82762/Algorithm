package 연습문제.정수제곱근판별;

class Solution {
    public long solution(long n) {
        //제곱근 판멸 함수
        long a= (long) Math.sqrt(n);
        long answer=0;
        if(a*a==n){
            answer=(a+1)*(a+1);
        }
        else{
            answer=-1;
        }
        if(n==1){
            answer=4;
        }
        return answer;
    }
}
