package 브루트포스.차이를최대로;

import java.util.Scanner;

public class Main {
    static int N;
    static int arr[];
    static boolean visit[];
    static int output[];
    static int max=0;
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();

        arr=new int[N];
        visit=new boolean[N];
        output=new int[N];

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        dfs(0);
        System.out.println(max);

    }
    static public void dfs (int dept){
        if(N==dept){
            cal(output);
            return;
        }

        for(int i=0; i<N; i++){

            if(visit[i]==false){
                output[dept]=arr[i];
                visit[i]=true;
                dfs(dept+1);

                visit[i]=false;
            }
        }

    }
    static void cal(int []output){
        int temp=0;
        for(int i=0;  i<output.length-1; i++){
            temp+=Math.abs(output[i]-output[i+1]);
        }
        max=Math.max(max,temp);
    }



}
