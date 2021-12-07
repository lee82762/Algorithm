package 스택or큐.야근지수;

import java.util.PriorityQueue;
class Retry {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer>queue=new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));
        int temp=0;
        for(int i=0; i<works.length; i++){
            queue.add(works[i]);
            temp+=works[i];
        }
        if(temp<=n){
            return 0;
        }
        while (n!=0){
            int a=queue.poll();
            a=a-1;
            queue.add(a);
            n--;
        }
        long answer=0;
        while (!queue.isEmpty()){
            int a=queue.poll();
            answer+=a*a;
        }
        return answer;
    }
}
