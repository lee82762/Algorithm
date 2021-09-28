package 리틀코드.CanMakeArithmeticProgressionFromSequence;

import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean answer=true;
        int temp=arr[1]-arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i]!=temp){
                answer=false;
            }
        }
        return answer;
    }
}
