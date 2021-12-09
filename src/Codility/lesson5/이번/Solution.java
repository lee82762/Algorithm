package Codility.lesson5.이번;

import java.util.*;
class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        boolean chek=false;
        for(int i=0; i<A.length-2; i++){
            long a=A[i];
            long b=A[i+1];
            long c=A[i+2];
            if(b+c>a && a+c>b && a+b>c){
                return 1;
            }
        }
        return 0;
    }
}
