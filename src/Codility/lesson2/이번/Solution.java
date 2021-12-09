package Codility.lesson2.이번;

import java.util.*;
class Solution {
    public int solution(int[] A) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int a:A){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        ArrayList<Integer>a1=new ArrayList<>(map.keySet());
        int answer=0;
        for(int a:a1){
            if(map.get(a)%2 !=0){
                answer=a;
            }
        }
        return answer;

    }
}
