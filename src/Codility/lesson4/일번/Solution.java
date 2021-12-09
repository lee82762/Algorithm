package Codility.lesson4.일번;

import java.util.HashSet;
class Solution {
    public int solution(int X, int[] A) {
        HashSet<Integer>set=new HashSet<>();

        for(int i=0; i<A.length; i++){
            if(A[i]<=X){
                set.add(A[i]);
            }
            if(set.size()==X){
                return i;
            }
        }
        return -1;
    }
}
