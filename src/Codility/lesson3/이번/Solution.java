package Codility.lesson3.이번;

public class Solution {
    public int solution(int A[]) {

        boolean visit[]=new boolean[A.length+2];

        for(int i=0; i<A.length; i++){
            visit[A[i]]=true;
        }
        int answer=0;
        for(int i=1; i<visit.length; i++){
            if(!visit[i]){
                answer=i;
            }
        }
        return -1;

    }
}
