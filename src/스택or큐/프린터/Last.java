package 스택or큐.프린터;

import java.util.Comparator;
import java.util.PriorityQueue;
class Last {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer>queue=new PriorityQueue<>(Comparator.reverseOrder());
        for(int a: priorities){
            queue.add(a);
        }

        int answer=0;
        while (!queue.isEmpty()){
            boolean check=true;
            for(int i=0; i<priorities.length; i++){
                if(queue.peek()==priorities[i]){
                    if(i==location){
                        check=false;
                        answer++;
                    }
                    else{
                        queue.poll();
                        answer++;
                    }

                }
                if(check==false){
                    queue.clear();
                    break;
                }
            }
        }
        return answer;
    }
}
