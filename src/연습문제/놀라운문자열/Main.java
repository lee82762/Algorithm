package 연습문제.놀라운문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static  String N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true){
            N=sc.next();
            if(N.equals("*")){
                break;
            }
            if(N.length()==1){
                System.out.println(N+" is surprising.");
            }
            ArrayList<String>s1=new ArrayList<>();
            for(int i=0; i<=N.length()-2; i++){
                s1.clear();
                for(int j=0; j<N.length(); j++){
                    int cnt=j+(i+1);
                    char s=N.charAt(j);
                    char s3=N.charAt(cnt);


                    String re=String.valueOf(s)+String.valueOf(s3);
                    if(s1.contains(re)){
                        s1.clear();
                        break;
                    }
                    else{
                        s1.add(re);
                    }

                    if(cnt==N.length()-1){
                        break;
                    }

                }
                if(s1.isEmpty()){
                    System.out.println(N+" is NOT surprising.");
                    break;
                }

            }
            if(!s1.isEmpty()){
                System.out.println(N+" is surprising.");
            }

        }


    }
}