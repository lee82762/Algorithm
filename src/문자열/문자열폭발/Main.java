package 문자열.문자열폭발;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        Stack<Character>st=new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            st.add(c);
            if(st.size() >= s1.length()){
                boolean check=true;
                for(int j=0; j<s1.length(); j++){
                    char c1=st.get(st.size()-s1.length()+j);
                    char c2=s1.charAt(j);
                    if(c1!=c2){

                        check=false;
                        break;
                    }
                }
                if(check){
                    for(int j=0; j<s1.length(); j++){
                        st.pop();
                    }
                }

            }
        }
        if(st.isEmpty()){
            System.out.println("FRULA");
        }
        else {
            StringBuilder sb = new StringBuilder();
            for(char c : st) {
                sb.append(c);
            }
            System.out.println(sb.toString());
        }




    }
}
