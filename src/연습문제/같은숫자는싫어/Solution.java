package 연습문제.같은숫자는싫어;

import java.util.*;
public class Solution {
    public static int[] solution(int []arr) {


        Stack<Integer>st=new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(st.isEmpty()){
                st.add(arr[i]);
            }
            else{
                if(st.peek()==arr[i]){
                    continue;
                }
                else{
                    st.add(arr[i]);
                }
            }
        }
        int []answer=new int[st.size()];
        for(int i=0; i<st.size(); i++){
            answer[i]=st.get(i);
        }


        return answer;
    }
}
