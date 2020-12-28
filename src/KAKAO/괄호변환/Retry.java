package KAKAO.괄호변환;

import java.util.Stack;
class Retry {
    public String solution(String p) {
        String answer=chep(p);
        return answer;
    }

    static String chep(String p){
        String result="";
        //1.빈문저열일경우 빈문자열 반환
        if(p.length()==0){
            return "";
        }
        int cnt=0;
        int cnt1=0;
        int idx=0;
        //문자열 u,v를 분리한다.
        for(int i=0; i<p.length(); i++){
            char c=p.charAt(i);
            if(c=='('){
                cnt++;
            }
            else if(c==')'){
                cnt1++;
            }
            if(cnt!=0&&cnt1!=0&&cnt==cnt1){
                idx=i;
                break;
            }
        }
        String u=p.substring(0,idx+1);
        String v=p.substring(idx+1,p.length());

        //올바른 괄호 문자열이라면 u+[chep()재귀]한것을 return
        if(check(u)==true){
            result=u+chep(v);
            return result;
        }
        //올바른 괄호 문자열이아니면
        //  4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
        // 4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
        //4-3. ')'를 다시 붙입니다.
        // 4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서뒤에 붙입니다.
        // 4-5. 생성된 문자열을 반환합니다.
        else{
            String em="";
            em="(";
            em+=chep(v);
            em+=")";
            u=u.substring(1,u.length()-1);
            String nu="";
            for(int i=0; i<u.length(); i++){
                char c=u.charAt(i);
                if(c=='('){
                    nu+=")";
                }
                else{
                    nu+="(";
                }
            }
            return em+nu;

        }

    }
    //u가 올바른 괄호 문자열인지 확인하는 함수
    static boolean check(String u){
        boolean ans=true;
        Stack<Character>st=new Stack<>();
        for(int i=0; i<u.length(); i++){
            char c=u.charAt(i);
            if(st.isEmpty()){
                st.add(c);
            }
            else {
                if(st.peek()=='('&&c==')'){
                    st.pop();
                }
                else{
                    st.add(c);
                }
            }
        }
        if(!st.isEmpty()){
            ans=false;
        }
        return ans;
    }
}