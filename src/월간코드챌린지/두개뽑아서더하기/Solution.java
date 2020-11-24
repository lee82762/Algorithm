package 월간코드챌린지.두개뽑아서더하기;

import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        ArrayList<Integer>a1=new ArrayList<>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int an=numbers[i]+numbers[j];
                if(!a1.contains(an)){
                    a1.add(an);
                }
            }
        }
        int answer[]=new int[a1.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=a1.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
