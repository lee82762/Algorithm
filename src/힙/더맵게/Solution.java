package 힙.더맵게;

import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int k) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            queue.add(scoville[i]);
        }
        int answer=0;
        for(int i=0; i<scoville.length; i++){
            if(queue.peek()<k){
                queue.add(queue.poll()+(queue.poll()*2));
                answer++;
            }
            if(queue.size()==1){
                if(queue.peek()<k){
                    return -1;
                }
            }
        }
        return answer;
    }
}
