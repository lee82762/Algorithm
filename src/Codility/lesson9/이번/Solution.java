package Codility.lesson9.이번;

class Solution {
    public int solution(int M, int[] A) {
        int answer=0;
        int right=0;
        boolean check[]=new boolean[M+1];
        for(int i=0; i<A.length; i++){
            while (right<A.length && !check[A[right]]){
                answer+=right-i+1;
                check[A[right]]=true;
                right++;
                if(answer>=1000000000){
                    return 1000000000;
                }
            }
            check[A[i]]=false;

            if(answer>=1000000000){
                return 1000000000;
            }
        }
        return answer;
    }
}
