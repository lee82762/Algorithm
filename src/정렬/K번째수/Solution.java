package 정렬.K번째수;

import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer>a1=new ArrayList<>();

        int answer[]=new int[commands.length];
        for(int i=0; i<commands.length; i++){
            a1.clear();
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                a1.add(array[j]);
            }
            Collections.sort(a1);
            answer[i]=a1.get(commands[i][2]-1);

        }

        return answer;
    }
}
