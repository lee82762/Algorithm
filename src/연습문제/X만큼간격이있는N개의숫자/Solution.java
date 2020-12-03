package 연습문제.X만큼간격이있는N개의숫자;

class Solution {
    public long[] solution(int x, int n) {
        long []answer=new long[n];
        long re=x;
        for(int i=0; i<n; i++){
            answer[i]=re;
            re+=x;
        }
        return answer;

    }
}
