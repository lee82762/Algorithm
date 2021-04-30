package 스택or큐.괄호회전하기;

import java.util.Stack;
//괄호는 스택으로 해결
class Solution {
    public int solution(String s) {
        int answer=0;
        for(int i=0; i<s.length(); i++){
            if(i==0){
                if(check(s)==true){
                    answer++;
                }
                continue;
            }
            char c=s.charAt(0);
            s=s.substring(1,s.length());
            s=s+c;
            if(check(s)==true){
                answer++;
            }

        }
        return answer;
    }
    static boolean check(String s){
        boolean result=true;
        Stack<Character>st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.add(c);
            }
            else{
                if((st.peek()=='('&&c==')')||(st.peek()=='['&&c==']')||st.peek()=='{'&&c=='}'){
                    st.pop();
                }
                else{
                    st.add(c);
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }
}
