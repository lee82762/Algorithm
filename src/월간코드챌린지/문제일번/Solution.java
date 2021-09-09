package 월간코드챌린지.문제일번;

import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            a1.add(numbers[i]);
        }
        int answer=0;
        int j=0;
        for(int i=0; i<=9; i++){
            if(!a1.contains(i)){
                answer+=i;
            }

        }
        return answer;
    }
}