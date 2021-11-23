package 힙.더맵게;

import java.util.*;
class Retry {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        for(int a:scoville){
            queue.add(a);
        }
        int answer=0;
        while (queue.peek()<K){
            if(queue.size()==1){
                if(queue.peek()<K){
                    answer=-1;
                    break;
                }

            }

            int temp=queue.poll()+(queue.poll()*2);
            queue.add(temp);
            answer++;

        }
        return answer;

    }
}
