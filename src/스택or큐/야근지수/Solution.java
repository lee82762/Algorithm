package 스택or큐.야근지수;

import java.util.Comparator;
import java.util.PriorityQueue;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer>queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        int temp=0;
        for(int i=0; i<works.length; i++){
            temp+=works[i];
        }
        if(temp<=n){
            return 0;
        }
        for(int i=0; i<works.length; i++) {
            queue.add(works[i]);
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
            answer+=(a*a);
        }

        return answer;
    }
}
