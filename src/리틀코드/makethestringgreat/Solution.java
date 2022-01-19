package 리틀코드.makethestringgreat;

import java.util.*;
class Solution {
    public String makeGood(String s) {
        Stack<String>st=new Stack<>();
        String re[]=s.split("");

        for(int i=0; i<re.length; i++){
            if(st.isEmpty()){
                st.add(re[i]);
            }
            else{
                if(Character.isUpperCase(re[i].charAt(0))){
                    if(st.peek().equals(re[i].toLowerCase()) || st.peek().toLowerCase().equals(re[i]) ){
                        st.pop();
                    }
                    else{
                        st.add(re[i]);
                    }
                }
                else{
                    if(Character.isUpperCase(st.peek().charAt(0))) {
                        if (st.peek().toLowerCase().equals(re[i])) {
                            st.pop();
                        }
                        else {
                            st.add(re[i]);
                        }
                    }
                    else{
                        st.add(re[i]);
                    }
                }
            }
        }
        if(st.isEmpty()){
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        String answer=sb.reverse().toString();
        return answer;

    }
}
