package 연습문제.문자열내마음대로정렬하기;

import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {

        String []strings1=new String[strings.length];

        for(int i=0; i<strings.length; i++){
            char c=strings[i].charAt(n);

            strings1[i]=c+strings[i];

        }
        Arrays.sort(strings1);

        for(int i=0; i<strings1.length; i++){
            strings1[i]=strings1[i].substring(1,strings1[i].length());

        }

        return strings1;
    }
}
