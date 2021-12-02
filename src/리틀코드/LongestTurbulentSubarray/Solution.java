package 리틀코드.LongestTurbulentSubarray;

class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int odd=1;
        int even=1;
        int answer=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                odd=even+1;
                even=1;
            }
            else if(arr[i]<arr[i-1]){
                even=odd+1;
                odd=1;
            }
            else{
                odd=1;
                even=1;
            }
            answer=Math.max(answer,Math.max(odd,even));
        }
        return answer;

    }
}
