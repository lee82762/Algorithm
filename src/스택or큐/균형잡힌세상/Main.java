package 스택or큐.균형잡힌세상;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String s;

        while(true) {
            s = in.nextLine();

            if(s.equals(".")) {	// 종료 조건문
                break;
            }

            if(check(s)==true){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }

    public static boolean check(String s){
        boolean answer=true;

        Stack<Character>st=new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);


            if (c == '(' || c == '[') {
                st.add(c);
            }

            else if (c == ')') {
                if (!st.isEmpty()&&st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            }


            else if (c == ']') {
                if (!st.isEmpty()&&st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }

        }


        if(!st.isEmpty()){
            answer=false;
        }
        return answer;
    }
}
