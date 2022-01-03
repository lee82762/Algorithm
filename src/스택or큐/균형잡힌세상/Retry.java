package 스택or큐.균형잡힌세상;

import java.util.Scanner;
import java.util.Stack;

public class Retry {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        while (true){
            String s=sc.nextLine();
            if(s.length()==1 && s.equals(".")){
                break;
            }
            Stack<Character> st =new Stack<>();
            for(int i=0; i<s.length(); i++){
                char c=s.charAt(i);
                if(st.isEmpty() && (c==')' || c==']')){
                    st.add(c);
                    break;
                }
                if(st.isEmpty() && (c=='(' || c=='[')){
                    st.add(c);
                }
                else{
                    if(c=='(' || c==')' || c=='[' || c==']') {
                        if (st.peek() == '(' && c == ')') {
                            st.pop();
                        } else if (st.peek() == '[' && c == ']') {
                            st.pop();
                        } else {
                            st.add(c);
                        }
                    }
                }
            }
            if(st.isEmpty()){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }



    }
}
