package 스택or큐.괄호의값;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static String N;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        N=sc.next();
        Stack<String>st=new Stack<String>();
        String s1[]=N.split("");
        int cnt=0;

        for(int i=0; i<s1.length; i++){
            if(s1[i].equals("(")||s1[i].equals("[")){
                st.add(s1[i]);
            }
            else{
                if(st.isEmpty()){
                    System.out.println("0");
                    return;
                }
                else{
                    if(s1[i].equals(")")){
                        if(st.peek().equals("(")){
                            st.pop();
                            st.add("2");
                        }
                        else{
                            check(st,"[","(",2);
                        }
                    }
                    else if(s1[i].equals("]")){
                        if(st.peek().equals("[")){
                            st.pop();
                            st.add("3");
                        }
                        else {
                            check(st,"(","[",3);

                        }
                    }
                }
            }
        }
        int answer=0;
        while (!st.isEmpty()){
            if(st.peek().equals("(")||st.peek().equals(")")||st.peek().equals("[")||st.peek().equals("]")){
                System.out.println("0");
                return;
            }
            else{
                answer+=Integer.parseInt(st.pop());
            }
        }
        System.out.println(answer);

    }
    public static void check(Stack<String> st,String c,String c1, int value){
        int result=0;
        while (!st.isEmpty()){

            if(st.peek().equals(c)){
                return;
            }
            else if(st.peek().equals(c1)){
                result*=value;
                st.pop();
                st.push(Integer.toString(result));
                break;
            }
            else{
                result+=Integer.parseInt(st.pop());
            }

        }

    }
}
