package 연습문제.N개의최소공배수;

import java.util.Stack;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Stack<Integer>st=new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(st.isEmpty()){
                int re=lcm(arr[i],arr[i+1]);
                i++;
                st.add(re);
            }
            else{
                int re=lcm(st.peek(),arr[i]);
                st.pop();
                st.add(re);
            }
        }

        answer=st.peek();
        return answer;
    }
    static int gcd(int x,int y){
        int result=0;
        while(y!=0){
            int c=x%y;
            x=y;
            y=c;

        }
        return x;
    }
    static int lcm(int x,int y){

        int result=(x*y)/gcd(x,y);
        return result;
    }
}