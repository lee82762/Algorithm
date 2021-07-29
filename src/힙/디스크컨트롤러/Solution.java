package 힙.디스크컨트롤러;

import java.util.*;
class Solution {
    public int solution(int[][] jobs) {

        Arrays.sort(jobs,((o1, o2) -> o1[0]-o2[0]));
        PriorityQueue<int []>queue=new PriorityQueue<>((o1, o2) -> o1[1]-o2[1]);
        int cnt=0;
        int idx=0;
        int now=0;
        int answer=0;

        while (cnt<jobs.length){

            while (idx<jobs.length&&jobs[idx][0]<=now){
                queue.add(jobs[idx++]);
            }

            if(queue.isEmpty()){
                now=jobs[idx][0];
            }
            else{
                int temp[]=queue.poll();
                answer+=temp[1]+now-temp[0];
                now+=temp[1];
                cnt++;

            }

        }
        return answer/jobs.length;
    }
}
