package Codility.lesson8.일번;

import java.util.HashMap;
class Solution {
    public int solution(int[] A) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a: A){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int res=0;
        int count=0;
        for(Integer key: map.keySet()){
            if(map.get(key)>res){
                res=map.get(key);
                count=key;
            }
        }
        if(res<=A.length/2){
            return -1;
        }

        for(int i=0; i<A.length; i++){
            if(count==A[i]){
                return i;
            }
        }
        return -1;
    }
}
