package 연습문제.학생번호;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int  N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        String dp[]=new String[N];

        for(int i=0; i<N; i++){
            dp[i]=sc.next();

        }
        int n=dp[0].length();
        int cnt=n-1;
        int answer=0;

        ArrayList<String>s1=new ArrayList<>();

        while (true){
            if(cnt<0){
                System.out.println(n);
                return;
            }
            for(int i=0; i<N; i++){
                String t=dp[i].substring(cnt,n);
                if(s1.isEmpty()){
                    s1.add(t);
                }
                else{
                    if(s1.contains(t)){
                        s1.clear();
                        break;
                    }
                    else{
                        s1.add(t);
                    }

                }
            }
            if(s1.isEmpty()){
                cnt--;
            }
            else{
                break;
            }
        }
        System.out.println(s1.get(0).length());

    }
}
