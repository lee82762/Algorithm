package 스택or큐.짝지어제거하기;

import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        Stack<String>st=new Stack<>();
        String s1[]=s.split("");
        for(int i=0; i<s1.length; i++){
            if(st.isEmpty()){
                st.add(s1[i]);
            }
            else if(st.peek().equals(s1[i])){
                st.pop();
            }
            else{
                st.add(s1[i]);
            }

        }
        int answer=0;
        if(st.isEmpty()){
            answer=1;
        }
        else{
            answer=0;
        }

        return answer;
    }
}
