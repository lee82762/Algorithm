package 스택or큐.다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum=0; //무게계산
        int time=0; //시간
        //Queue는 다리를 나타낸다.
        Queue<Integer>qu=new LinkedList<>();

        for(int i=0; i<truck_weights.length; i++){
            while (true){
                //큐가비었을때
                if(qu.isEmpty()){
                    qu.add(truck_weights[i]);
                    sum+=truck_weights[i];
                    time++;
                    break;
                }
                //큐의크기가 다리길이와 같을때
                else if(qu.size()==bridge_length){
                    sum-=qu.poll();
                }
                else{
                    //이전의 더한 무게와 더해야할 트럭 무게가 견딜수 있는 무게 보다 클때
                    if(sum+truck_weights[i]>weight){
                        time++;
                        qu.add(0);
                    }
                    //이전의 더한 무게와 더해야할 트럭 무게가 견딜수 있는 무게 보다 작을때
                    else{
                        qu.add(truck_weights[i]);
                        sum+=truck_weights[i];
                        time++;
                        break;

                    }

                }
            }
        }
        int answer=time+bridge_length;//마지막 트럭 시간 더하기
        return answer;
    }
}
