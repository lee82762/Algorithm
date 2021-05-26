package DFSandBFS.쿼드트리;

import java.util.Scanner;

public class Main {
    static int N;
    static int len=0;
    static int arr[][];
    static int one;
    static int zero;
    static String answer="";
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        len=N;
        arr=new int[N][N];


        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<N; j++){
                arr[i][j]=Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }

        dfs(arr,0,0,len);


        System.out.println(answer);

    }
    static void dfs(int arr[][],int a, int b,int len){
        if(len==1){
            if(arr[a][b]==1){
                answer+="1";
                one++;
            }
            else{
                answer+="0";
                zero++;
            }

            return;

        }

        boolean flag=true;
        int v=arr[a][b];


        for(int i=a; i<a+len; i++){
            if(flag){
                for(int j=b; j<b+len; j++){
                    if(v!=arr[i][j]){
                        flag=false;
                        break;
                    }
                }
            }
            else{
                break;
            }
        }

        if(flag){
            if(v==1){
                answer+="1";
                one++;
            }
            else{
                answer+="0";
                zero++;
            }

        }


        else{
            answer+="(";
            len=len/2;

            dfs(arr,a,b,len);

            dfs(arr,a,b+len,len);

            dfs(arr,a+len,b,len);

            dfs(arr,a+len,b+len,len);
            answer+=")";

        }





    }
}
