package 리틀코드.HeightChecker;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int arr[]=heights.clone();

        Arrays.sort(arr);

        int answer=0;
        for(int i=0; i<heights.length; i++){
            if(heights[i]!=arr[i]){
                answer++;
            }
        }
        return answer;
    }
}
