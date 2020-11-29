package 연습문제.문자열내림차순으로배치하기;

import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String []s1=s.split("");
        Arrays.sort(s1, Collections.reverseOrder());

        String answer="";
        for(int i=0; i<s1.length; i++){
            answer+=s1[i];
        }


        return answer;
    }
}
