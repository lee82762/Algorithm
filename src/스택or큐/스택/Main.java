package 스택or큐.스택;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Stack<Integer>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<N; i++){
            String s=sc.next();
            if(s.equals("push")){
                int a=sc.nextInt();
                st.add(a);
            }
            else if(s.equals("pop")){
                if(st.isEmpty()){
                    sb.append("-1"+"\n");
                }
                else {
                    sb.append(st.pop()+"\n");

                }
            }
            else if(s.equals("size")){
                sb.append(st.size()+"\n");
            }
            else if(s.equals("empty")){
                if(st.isEmpty()){
                    sb.append("1"+"\n");
                }
                else{
                    sb.append("0"+"\n");
                }
            }
            else{
                if(st.isEmpty()){
                    sb.append("-1"+"\n");
                }
                else{
                    sb.append(st.peek()+"\n");
                }
            }

        }
        System.out.println(sb);
    }
}
