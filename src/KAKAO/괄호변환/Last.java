package KAKAO.괄호변환;

import java.util.Stack;
class Last {
    public String solution(String p) {
        if(check(p)==true){
            return p;
        }
        else{

            return change(p);
        }

    }

    static public String change(String P){

        if(P.length()==0){
            return "";
        }
        else{
            String u="";
            String v="";
            int cnt=0;
            int cnt1=0;
            int idx=0;
            for(int i=0; i<P.length(); i++){
                char c=P.charAt(i);
                if(c=='('){
                    cnt++;
                }
                else{
                    cnt1++;
                }

                if(cnt!=0 && cnt1!=0 && cnt==cnt1){
                    idx=i;
                    break;
                }
            }
            u=P.substring(0,idx+1);
            v=P.substring(idx+1,P.length());

            if(check(u)){
                return u+change(v);
            }
            else{
                String temp="";
                temp+="("+change(v)+")";
                u=u.substring(1,u.length()-1);
                String tm="";
                for(int i=0; i<u.length(); i++){
                    char c=u.charAt(i);
                    if(c=='('){
                        tm+=")";
                    }
                    else{
                        tm+="(";
                    }
                }
                temp+=tm;
                return temp;
            }

        }


    }
    static public boolean check(String s){
        Stack<Character>st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.add(c);
            }
            else{
                if(st.peek()=='(' && c==')'){
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
