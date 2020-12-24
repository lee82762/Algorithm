package 스택or큐.프린터;

import java.util.Collections;
import java.util.PriorityQueue;
class Retry {
    public int solution(int[] pri, int location) {
        PriorityQueue<Integer>qu=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<pri.length; i++){
            qu.add(pri[i]);
        }
        int answer=0;

        while (!qu.isEmpty()){
            for(int i=0; i<pri.length; i++){
                if(qu.peek()==pri[i]){
                    if(location==i){
                        answer++;
                        qu.clear();
                        break;
                    }
                    else{
                        qu.poll();
                        answer++;
                    }

                }
            }
        }
        return answer;
    }
}