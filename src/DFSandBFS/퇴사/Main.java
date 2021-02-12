package DFSandBFS.퇴사;


import java.util.Scanner;

public class Main{
    static int N;
    static int T[];
    static int P[];
    static int dp[];
    static int answer=0;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        T=new int[N+10];
        P=new int[N+10];
        dp=new int[N+10];

        for(int i=0; i<N; i++){
            T[i]=sc.nextInt();
            P[i]=sc.nextInt();
        }
        dfs(0,0);
        System.out.println(answer);



    }
    public static void  dfs(int index,int answer1){
        if(index>=N){

            answer=Math.max(answer,answer1);
            return;
        }

        //인덱스가 포함되는경우
        if(index+T[index]<=N){

            dfs(index+T[index],answer1+P[index]);
        }


        //인덱스가 포함되지 않는경우
        dfs(index+1,answer1);

    }

}
