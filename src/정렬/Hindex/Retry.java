package 정렬.Hindex;

import java.util.Arrays;
class Retry {
    public int solution(int[] citations) {
        int cnt = 0;
        int answer = 0;
        int n = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            cnt = 0;
            for (int j = 0; j < citations.length; j++) {
                if (i <= citations[j]) {
                    cnt++;
                }
            }
            if(cnt>=i){
                answer=i;
            }

        }
        if(cnt==n){
            answer=n;
        }
        return answer;
    }
}