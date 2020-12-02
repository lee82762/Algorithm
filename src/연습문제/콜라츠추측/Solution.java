package 연습문제.콜라츠추측;

class Solution {
    public int solution(long n) {
        int cnt=0;
        if(n==1) return 0;
        while (true){
            if(n%2==0){
                n=n/2;
                cnt++;
            }
            else{
                n=(n*3)+1;
                cnt++;

            }
            if(n==1){
                break;
            }
            if(cnt>500){
                break;
            }

        }
        if(cnt>500){
            cnt=-1;
        }
        return cnt;
    }
}
