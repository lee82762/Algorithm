package 브루트포스.순열;

import java.util.Scanner;

public class Main{
    static int N;
    static String []arr;
    static String []output;
    static boolean visit[];
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new String[N];
        output=new String[N];
        visit=new boolean[N];

        for(int i=0; i<N; i++){
            arr[i]=Integer.toString(i+1);
        }
        dfs(0);

    }
    static public void dfs(int dept){
        if(dept==N){
            for(int i=0; i<output.length; i++){
                if(i!=output.length-1) {
                    System.out.print(output[i] + " ");
                }
                else{
                    System.out.print(output[i]);
                }
            }
            System.out.println(" ");
        }

        for(int i=0; i<arr.length; i++){
            if(visit[i]==false){
                output[dept]=arr[i];
                visit[i]=true;
                dfs(dept+1);
                visit[i]=false;
            }
        }
    }


}
