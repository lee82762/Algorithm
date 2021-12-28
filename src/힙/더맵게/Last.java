package 힙.더맵게;

import java.util.*;
class Last {
    public int solution(int[] scovile, int K) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        for(int a : scovile){
            queue.add(a);
        }
        int answer=0;

        while(queue.peek()<K){
            if(queue.size()==1){
                if(queue.peek()<K){
                    answer=-1;
                    break;
                }
            }

            queue.add(queue.poll()+queue.poll()*2);
            answer++;

        }

        return answer;

    }
}