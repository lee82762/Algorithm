package KAKAO.괄호변환;

import java.util.Stack;
class Solution {
    public String solution(String p) {
        String answer = change(p);
        return answer;
    }
    static String change(String p){

        if(p.length()==0){
            return "";
        }

        int cnt=0;
        int cnt1=0;
        int idx=0;
        for(int i=0; i<p.length(); i++){
            char c=p.charAt(i);
            if(c=='('){
                cnt++;
            }
            if(c==')'){
                cnt1++;
            }
            if(cnt!=0&&cnt1!=0&&cnt==cnt1){
                idx=i;
                break;
            }
        }
        String u=p.substring(0,idx+1);
        String v=p.substring(idx+1,p.length());


        if(!collect(u)){
            String an="("+change(v)+")";
            u=u.substring(1,u.length()-1);

            StringBuilder sb=new StringBuilder();
            for(int i=0; i<u.length(); i++){
                char c=u.charAt(i);
                if(c=='('){
                    sb.append(")");
                }
                else{
                    sb.append("(");
                }
            }
            return an+sb.toString();
        }
        else{
            return u+change(v);

        }
    }
    static boolean collect(String s){
        Stack<Character>st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.add(c);
            }
            else{
                if(st.peek()=='('&&c==')'){
                    st.pop();
                }
                else{
                    st.add(c);
                }
            }

        }
        boolean result=false;
        if(st.isEmpty()){
            result=true;
        }

        return result;

    }
}