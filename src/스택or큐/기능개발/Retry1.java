package 스택or큐.기능개발;

import java.util.ArrayList;
class Retry1 {
    public int[] solution(int[] progresses, int[] speeds) {
        int []result=new int[speeds.length];
        for(int i=0; i<progresses.length; i++){
            int cnt=0;
            while (true){
                progresses[i]+=speeds[i];
                cnt++;
                if(progresses[i]>=100){
                    break;
                }
            }
            result[i]=cnt;
        }

        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=0; i<result.length; i++){
            int cnt=1;
            for(int j=i+1; j<result.length; j++) {
                if (result[j] > result[i]) {
                    i = (j-1);
                    break;
                } else {
                    cnt++;
                    if(j==result.length-1){
                        i=j;
                    }
                }
            }
            a1.add(cnt);
        }
        int answer[]=new int[a1.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=a1.get(i);
        }
        return answer;

    }
}