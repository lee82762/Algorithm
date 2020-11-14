package KAKAO.문자열압축;

import java.util.Stack;
class Solution {
    public int solution(String s) {
        int a=s.length()/2;
        Stack<String> st=new Stack<>();

        int cnt2=1;
        String anw="";
        int answer=0;

        for(int i=1; i<=a; i++){
            int cnt=i;
            int cnt1=0;
            cnt2=1;
            for(int j=0; j<s.length(); j++){
                cnt=(j+1)*i;
                if(cnt>s.length()){
                    cnt=s.length();
                }
                if(cnt1>=s.length()){
                    break;
                }
                String s1=s.substring(cnt1,cnt);
                // System.out.println(s1);

                if(st.isEmpty()){
                    st.add(s1);
                }
                else{
                    if(st.peek().equals(s1)){
                        st.pop();
                        cnt2++;
                        if(cnt2>2){
                            st.pop();
                        }
                        String ch=Integer.toString(cnt2);
                        st.add(ch);
                        st.add(s1);
                    }
                    else{
                        cnt2=1;
                        st.add(s1);
                    }

                }


                cnt1+=i;

            }

            for(int k=0; k<st.size(); k++){
                anw+=st.get(k);
            }




            if(answer==0) {
                answer=anw.length();


            }
            if(answer>anw.length()){
                answer=anw.length();
            }
            anw="";
            st.clear();

        }
        if(s.length()==1){
            answer=1;
        }
        return answer;

    }
}