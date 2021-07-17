package KAKAO.표편집;

import java.util.Stack;
class Solution {
    public String solution(int n, int k, String[] cmd) {

        Stack<Integer>st=new Stack<>();
        int len=n;


        for(int i=0; i<cmd.length; i++){
            String []s=cmd[i].split(" ");
            //아래면 k 더하기
            if(s[0].equals("D")){
                k+=Integer.parseInt(s[1]);
            }
            //위면 k 빼기
            else if(s[0].equals("U")){
                k-=Integer.parseInt(s[1]);

            }
            //제거 면 전체길이 줄이고 만약 전체길이가 k와같으면 마지막이므로
            else if(s[0].equals("C")){
                st.add(k);
                len--;
                if(len==k){
                    k-=1;
                }
            }
            //되돌리기면 최근 삭제한거 복구 최근것이 k보다 작으면 K증가 복구됬으므로 전체길이늘리기
            else if(s[0].equals("Z")){
                int temp=st.pop();
                if(k>=temp){
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


