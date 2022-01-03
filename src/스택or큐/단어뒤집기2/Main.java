package 스택or큐.단어뒤집기2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Stack<Character>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='<' && !st.isEmpty()){
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
            }
            if(st.isEmpty()){
                if(c=='<'){
                    sb.append("<");
                    st.add(c);
                }
                else{
                    st.add(c);
                }
            }
            else{
                if(st.peek() != '<' && c==' '){
                    while (!st.isEmpty()){
                        sb.append(st.pop());
                    }
                    sb.append(" ");
                }
                else if(st.peek()!='<'){
                    st.add(c);
                }

                if(!st.isEmpty()) {
                    if (st.peek() == '<' && c != '>') {
                        sb.append(c);
                    } else if (st.peek() == '<' && c == '>') {
                        sb.append(c);
                        st.clear();

                    }
                }


            }
        }
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        System.out.println(sb);

    }
}
