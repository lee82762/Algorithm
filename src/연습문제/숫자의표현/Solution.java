package 연습문제.숫자의표현;

class Solution {
    public int solution(int n) {
        int answer = 0;



        for(int i=1; i<=n; i++){
            int sum=0;
            for(int j=i;  sum<=n; j++){
                sum+=j;
                if(sum==n){
                    answer++;
                }
            }
        }
        return answer;
    }
}