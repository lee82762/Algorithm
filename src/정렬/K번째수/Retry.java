package 정렬.K번째수;

import java.util.*;
class Retry {
    public int[] solution(int[] array, int[][] commands) {
        int answer[]=new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int a=commands[i][0];
            int b=commands[i][1];
            int c=commands[i][2];
            ArrayList<Integer>a1=new ArrayList<>();
            for(int j=a-1; j<b; j++){
                a1.add(array[j]);
            }
            Collections.sort(a1);
            answer[i]=a1.get(c-1);
        }

        return answer;
    }
}
