package 스택or큐.프린터;

import java.util.Comparator;
import java.util.PriorityQueue;
class Last1 {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer>queue=new PriorityQueue<>(Comparator.reverseOrder());
        for(int a:priorities){
            queue.add(a);
        }
        int answer=0;
        while (!queue.isEmpty()){

            boolean chek=true;
            for(int i=0; i<priorities.length; i++){
                if(queue.peek()==priorities[i]){
                    if(location==i){
                        answer++;
                        chek=false;
                    }
                    else{
                        queue.poll();
                        answer++;
                    }
                }
                if(chek==false){
                    queue.clear();
                    break;
                }

            }



        }
        return answer;
    }
}
