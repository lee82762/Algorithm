package 연습문제.올바른괄호;

import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> st= new Stack<>();
        boolean answer=true;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.add(c);
            }
            else {



                if (st.peek()=='('&&c==')') {
                    st.pop();

                } else  {
                    st.add(c);

                }
            }



        }
        if(st.isEmpty()){
            answer=true;
        }
        else{
            answer=false;
        }



        return answer;
    }
}