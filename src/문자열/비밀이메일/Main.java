package 문자열.비밀이메일;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int R;
        int C;
        ArrayList<Integer>a1=new ArrayList<>();

        for(int i=1; i<=s.length(); i++){
            int tm=s.length();
            if(tm%i==0){
                if(i*i==s.length()){
                    a1.add(i);
                }
                a1.add(i);
            }
        }
        R=a1.get(a1.size()/2-1);
        C=a1.get(a1.size()/2);
        String arr[][]=new String[R][C];

        int cnt=0;
        int j=0;
        while (true){
            for(int i=0; i<R; i++){
                arr[i][j]=String.valueOf(s.charAt(cnt++));
            }
            j++;
            if(cnt==s.length()) {
                break;
            }
        }
        String answer="";
        for(int i=0; i<R; i++){
            for(int k=0; k<C; k++){
                answer+=arr[i][k];
            }
        }
        System.out.println(answer);




    }
}