package 연습문제.정수내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {

        String s=Long.toString(n);
        String []s1=s.split("");

        Arrays.sort(s1, Collections.reverseOrder());


        String s2="";
        for(int i=0; i<s1.length; i++){
            s2+=s1[i];
        }

        long answer=Long.parseLong(s2);
        return answer;

    }
}