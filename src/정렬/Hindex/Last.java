package 정렬.Hindex;
import java.util.Arrays;
class Last {
    public int solution(int[] citations) {
        int answer=0;
        int cnt=0;
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++){
            cnt=0;
            for(int j=0; j<citations.length; j++){
                if(i<=citations[j]){
                    cnt++;
                }
            }
            if(cnt>=i){
                answer=i;
            }

        }
        if(cnt==citations.length){
            answer=citations.length;
        }

        return answer;
    }
}
