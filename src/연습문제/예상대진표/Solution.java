package 연습문제.예상대진표;

class Solution
{
    public int solution(int n, int a, int b)
    {


        int answer=0;
        while(a!=b){
            if(a%2==1){
                a=a+1;
            }
            if(b%2==1){
                b=b+1;
            }
            a=a/2;
            b=b/2;
            answer++;
        }

        return answer;
    }
}