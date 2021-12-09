package Codility.lesson2.일번;

import java.util.*;
class Solution {
    public int[] solution(int A[],int K) {
        ArrayList<Integer>a1=new ArrayList<>();
        if(A.length==0){
            return A;
        }

        while (K!=0) {
            a1.add(A[A.length - 1]);
            for (int i = 0; i < A.length - 1; i++) {
                a1.add(A[i]);
            }
            int i=0;
            for(Integer n : a1){
                A[i++]=n;
            }
            a1.clear();
            K--;
        }
        return A;
    }
}
