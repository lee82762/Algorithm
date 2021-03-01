package 연습문제.그룹단어체커;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int  N;
    static String dp[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N=sc.nextInt();
        dp=new String[N];
        for(int i=0; i<N; i++){
            dp[i]=sc.next();
        }
        int answer=0;
        for(int i=0; i<dp.length; i++){
            Stack<String>st=new Stack<>();
            String s1[]=dp[i].split("");
            for(int j=0; j<s1.length; j++){
                if(st.isEmpty()){
                    st.add(s1[j]);
                }
                else{
                    if(st.peek().equals(s1[j])){
                        continue;
                    }
                    else{
                        if(st.contains(s1[j])){
                            st.add("1");
                            break;
                        }
                        st.add(s1[j]);
                    }
                }
            }

            if(!st.contains("1")){
                answer++;
            }
            st.clear();

        }
        System.out.println(answer);



    }
}
