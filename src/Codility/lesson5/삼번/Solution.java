package Codility.lesson5.삼번;

class Solution {
    public int solution(int A, int B, int K) {
        int answer=0;
        if(A%K==0){
            answer++;
        }
        if(A!=B){
            answer+=(B/K)-(A/K);
        }
        return answer;
    }
}
