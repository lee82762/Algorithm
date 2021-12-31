package 스택or큐.짝지어제거하기;

import java.util.Stack;
class Retry
{
    public int solution(String s)
    {
        Stack<Character>st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.add(c);
            }
            else{
                if(st.peek() == c){
                    st.pop();
                }
                else{
                    st.add(c);
                }
            }
        }
        if(st.isEmpty()){
            return 1;
        }
        else{
            return 0;
        }

    }
}
