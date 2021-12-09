package Codility.lesson9.일번;

class Solution {
    public int solution(int[] A) {
        if(A.length==0){
            return 0;
        }
        int min=A[0];
        int max=0;
        for(int i=1; i<A.length; i++){
            if(min>A[i]){
                min=A[i];
            }
            else{
                max=Math.max(A[i]-min,max);
            }
        }
        return max;
    }
}
