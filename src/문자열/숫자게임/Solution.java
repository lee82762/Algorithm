package 문자열.숫자게임;

import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer=0;
        Arrays.sort(A);
        Arrays.sort(B);

        int i=0;
        int j=0;

        while (true){
            if(A[i]<B[j]){
                answer++;
                i++;
                j++;
            }
            else if(A[i]>=B[j]){
                j++;
            }
            if(j==B.length){
                break;
            }

        }
        return answer;
    }
}
