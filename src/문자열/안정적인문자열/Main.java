package 문자열.안정적인문자열;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int N;
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=0;
        while (true){
            String s=sc.next();
            if(s.contains("-")){
                break;
            }
            arr.add(s);
        }


        for(int i=0; i<arr.size(); i++){
            String s=arr.get(i);
            System.out.println(i+1+". "+check(s));
        }


    }
    static public int check(String s){
        Stack<Character>st=new Stack<>();
        int asnwer=0;

        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c=='{'){
                st.add(c);
            }
            else{
                if(st.isEmpty()){
                    st.add('{');
                    asnwer++;
                }
                else{
                    st.pop();
                }
            }
        }
        return asnwer+st.size()/2;
    }
}
