package 문자열.maximumlengthofpairchain;

import java.util.Arrays;

class Solution {
    public int findLongestChain(int[][] pairs) {

        Arrays.sort(pairs,(o1, o2) -> o1[1]-o2[1]);
        int answer=1;
        int temp=pairs[0][1];

        for(int i=1; i<pairs.length; i++){
            if(temp<pairs[i][0]){
                answer++;
                temp=pairs[i][1];
            }
        }
        return answer;


    }
}
