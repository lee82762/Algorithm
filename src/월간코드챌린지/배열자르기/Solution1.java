package 월간코드챌린지.배열자르기;

import java.util.*;
class Solution1 {
    public long[] solution(int n, long left, long right) {
        ArrayList<Long>a1=new ArrayList<>();
        for(long i=left; i<=right; i++){
            a1.add(Math.max(i/n,i%n)+1);
        }
        long answer[]=new long[a1.size()];
        for(int i=0; i<a1.size(); i++){
            answer[i]=a1.get(i);
        }
        return answer;
    }
}
