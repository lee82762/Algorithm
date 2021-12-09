package Codility.lesson5.일번;

class Solution {
    public int solution(int[] A) {
        int zero=0;
        int  answer=0;
        for(int i=0; i<A.length; i++){
            if(A[i]==0){
                zero++;
            }
            else {
                answer+=zero;
            }
            if(answer>1000000000){
                answer=-1;
                break;
            }
        }
        return answer;
    }
}
