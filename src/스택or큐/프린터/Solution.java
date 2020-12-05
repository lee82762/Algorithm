package 스택or큐.프린터;

import java.util.Collections;
import java.util.PriorityQueue;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());



        for (int i = 0; i < priorities.length; i++) {
            priorityQueue.add(priorities[i]);
        }
        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty()){
            for (int i = 0; i < priorities.length; i++) {
                if (priorityQueue.peek() == priorities[i]) {
                    answer++;
                    priorityQueue.poll();
                    if (location == i) {
                        priorityQueue.clear();
                        break;
                    }
                }
            }
        }
        return answer;
    }
}