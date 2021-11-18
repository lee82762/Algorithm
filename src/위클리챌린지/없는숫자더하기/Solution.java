package 위클리챌린지.없는숫자더하기;

import java.util.ArrayList;
class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer>a1=new ArrayList<>();
        for(int num: numbers){
            a1.add(num);
        }
        int answer=0;
        for(int i=0; i<=9; i++){
            if(!a1.contains(i)){
                answer+=i;
            }
        }
        return answer;
    }
}