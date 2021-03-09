package 연습문제.문자메세지;

import java.util.HashMap;
import java.util.Scanner;

public class Main {


    static  int T;
    static  int R;
    static  int C;
    static  String M;
    static int dp[][];

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);

        T=sc.nextInt();

        HashMap<String, Integer>map=new HashMap<>();
        map.put(" ",0);
        char c='A';
        for(int i=1; i<=26;  i++){
            map.put(String.valueOf(c),i);
            c++;
        }
        for(int u=0; u<T; u++){
            R=sc.nextInt();
            C=sc.nextInt();
            M=sc.nextLine();

            dp=new int[R][C];
            M=M.substring(1,M.length());


            String M1="";
            String s1[]=M.split("");
            for(int i=0; i<s1.length; i++){
                if(map.containsKey(s1[i])){
                    String c1=Integer.toBinaryString(map.get(s1[i]));
                    int n=Integer.parseInt(c1);
                    String c2=String.format("%05d",n);
                    M1+=c2;
                }
            }



            String []re=M1.split("");
            int cnt=0;
            int k=0;
            int k1=0;
            int r=R;
            int c3=C;

            while (true){

                //오른쪽
                for(int i=0; i<C; i++){
                    dp[k][k1++]= Integer.parseInt(re[cnt++]);
                    if(cnt>=re.length){
                        break;
                    }
                }
                k++;
                k1--;
                R--;
                C--;

                if(cnt>=re.length){
                    break;
                }


                //아래
                for(int i=0; i<R; i++){
                    dp[k++][k1]=Integer.parseInt(re[cnt++]);
                    if(cnt>=re.length){
                        break;
                    }
                }
                k--;
                k1--;

                if(cnt>=re.length){
                    break;
                }

                //왼쪽
                for(int i=0; i<C; i++){
                    dp[k][k1--]=Integer.parseInt(re[cnt++]);
                    if(cnt>=re.length){
                        break;
                    }
                }
                k--;
                k1++;
                R--;
                C--;

                if(cnt>=re.length){
                    break;
                }

                //위쪽
                for(int i=0; i<R; i++){
                    dp[k--][k1]=Integer.parseInt(re[cnt++]);
                    if(cnt>=re.length){
                        break;
                    }
                }
                k++;
                k1++;

                if(cnt>=re.length){
                    break;
                }

            }
            String M3="";

            for(int i=0; i<r; i++){
                for(int j=0; j<c3; j++){
                    M3+=Integer.toString(dp[i][j]);
                }

            }
            System.out.println(M3);

        }

    }

}