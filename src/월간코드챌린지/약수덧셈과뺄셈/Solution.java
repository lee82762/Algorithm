package 월간코드챌린지.약수덧셈과뺄셈;
class Solution {
    public int solution(int left, int right) {


        int answer=0;


        for(int i=left; i<=right; i++){
            int a=i;
            int cnt=0;
            for(int j=1; j<=a; j++){
                if(a%j==0){
                    cnt++;
                }
            }

            if(cnt%2==0){
                answer+=i;
            }
            else{
                answer-=i;
            }
        }
        return answer;
    }
}
