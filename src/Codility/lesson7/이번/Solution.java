package Codility.lesson7.이번;

import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        Stack<Integer>st=new Stack<>();
        int answer=0;
        int size=0;
        for(int i=0; i<A.length; i++){
            if(B[i]==1) st.add(A[i]);
            else{
                while (!st.isEmpty()){
                    size=st.peek();
                    if(size>A[i]) break;
                    else{
                        st.pop();
                    }
                }
                if(st.isEmpty()){
                    answer++;
                }
            }
        }
        return answer+st.size();
    }
}
