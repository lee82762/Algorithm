package 리틀코드.PeakIndexinaMountainArray;

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int answer=0;

        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                answer=i-1;
                break;
            }

        }
        return answer;
    }
}
