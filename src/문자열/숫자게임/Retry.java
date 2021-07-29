package 문자열.숫자게임;

import java.util.*;
class Retry {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int i=0;
        int j=0;
        int answer=0;
        while (true){
            if(A[i]<B[j]){
                i++;
                j++;
                answer++;
            }
            else{
                j++;
            }
            if(j==A.length){
                break;
            }
        }
        return answer;
    }
}
