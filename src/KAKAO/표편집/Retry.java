package KAKAO.표편집;

import java.util.Stack;
class Retry {
    public String solution(int n, int k, String[] cmd) {

        int len=n;
        Stack<Integer>st=new Stack<>() ;
        for(int i=0; i<cmd.length; i++){
            String s[]=cmd[i].split(" ");

            if(s[0].equals("D")){
                k+=Integer.parseInt(s[1]);
            }
            else if(s[0].equals("C")){
                st.add(k);
                len--;
                if(len==k){
                    k-=1;
                }

            }
            else if(s[0].equals("U")){

                k-=Integer.parseInt(s[1]);
            }
            else if(s[0].equals("Z")){
                int tm=st.pop();
                if(tm<=k){
                    k+=1;
                }
                len+=1;
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0; i<len; i++){
            sb.append("O");
        }
        while (!st.isEmpty()){
            sb.insert(st.pop(),"X");
        }
        return sb.toString();
    }
}
