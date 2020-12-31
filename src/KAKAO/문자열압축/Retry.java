package KAKAO.문자열압축;

import java.util.*;
class Retry {
    public int solution(String s) {
        int n=s.length()/2;
        Stack<String>st=new Stack<>();
        int answer =0;
        for(int i=1; i<=n; i++){
            int cnt2=1;
            for(int j=0; j<s.length(); j++){
                //자르는 구간확인
                int cnt=j+i;

                if(cnt>s.length()){
                    cnt=s.length();
                }
                String s1=s.substring(j,cnt);

                if(st.isEmpty()){
                    st.add(s1);
                }
                else{

                    if(st.peek().equals(s1)){
                        st.pop();
                        cnt2++;

                        if(cnt2>2) {
                            st.pop();
                            st.add(Integer.toString(cnt2));
                            st.add(s1);
                        }
                        else {
                            st.add(Integer.toString(cnt2));
                            st.add(s1);
                        }
                    }
                    else{
                        cnt2=1;
                        st.add(s1);
                    }
                }
                //자르는 구간확인
                j=cnt-1;
            }
            ArrayList<String>a1=new ArrayList<>();
            for(int k=0; k<st.size(); k++){
                a1.add(st.get(k));
            }
            String ans1="";
            for(int u=0; u<a1.size(); u++){
                ans1+=a1.get(u);
            }
            if(answer==0){
                answer= ans1.length();
            }
            else if(answer>ans1.length()){
                answer=ans1.length();
            }
            a1.clear();
            st.clear();

        }
        if(s.length()==1){
            return 1;
        }
        return answer;

    }
}