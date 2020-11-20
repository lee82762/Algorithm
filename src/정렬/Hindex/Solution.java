package 정렬.Hindex;

import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int cnt=0;

        int answer=0;
        for(int i=1; i<=citations.length; i++){
            cnt=0;

            for(int j=0; j<citations.length; j++){

                if(i<=citations[j]){
                    cnt++;

                }
                if(cnt>=i){
                    answer=i;

                }
            }
        }
        return answer;
    }
}
