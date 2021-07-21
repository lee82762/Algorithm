package DP.handofstraights;

import java.util.*;
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        for(int a:hand){
            queue.add(a);
        }


        while (!queue.isEmpty()){
            int a=queue.poll();
            for(int i=1; i<groupSize; i++){
                if(queue.remove(a+i))
                    continue;
                else
                    return false;

            }
        }
        return true;

    }
}
