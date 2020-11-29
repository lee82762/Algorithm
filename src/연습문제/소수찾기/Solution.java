package 연습문제.소수찾기;

class Solution {
    public int solution(int n) {
        boolean check[]=new boolean[n+1];
        check[0]=false;
        check[1]=false;
        for(int i=2; i<=n; i++){
            check[i]=true;
        }

        for(int i=2; i*i<=n; i++){
            for(int j=i*i; j<=n; j+=i){
                check[j]=false;

            }
        }
        int answer=0;
        for(int i=2; i<=n; i++){
            if(check[i]==true){
                answer++;
            }
        }
        return answer;
    }
}
