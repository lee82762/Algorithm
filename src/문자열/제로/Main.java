package 문자열.제로;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int T;
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();
        Stack<Integer>st=new Stack<>();
        for(int i=0; i<T; i++){
            int a=sc.nextInt();
            if(st.isEmpty()){
                st.add(a);
            }
            else{
                if(a==0){
                    st.pop();
                }
                else{
                    st.add(a);
                }
            }
        }
        int answer=0;
        for(int i=0; i<st.size(); i++){
            answer+=st.get(i);
        }
        System.out.println(answer);


    }

}