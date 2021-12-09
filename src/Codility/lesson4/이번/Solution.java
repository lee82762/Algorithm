package Codility.lesson4.이번;

class Solution {
    public int solution(int[] A) {
        int sum1=0;
        boolean visit[]=new boolean[A.length+1];
        for(int i=1; i<=A.length; i++){
            sum1+=i;
        }
        int sum=0;
        for(int a:A){

            if(a>A.length){
                return 0;
            }
            if(visit[a]){
                return 0;
            }
            visit[a]=true;
            sum+=a;
        }
        if(sum!=sum1){
            return 0;
        }
        else{
            return 1;
        }
    }
}
