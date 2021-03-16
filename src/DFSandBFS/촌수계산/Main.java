package DFSandBFS.촌수계산;

import java.util.*;

//dfs로도 풀어보기
public class Main {
    static int N;
    static int M;
    static int dp[][];
    static int a;
    static int b;
    static  int dp1[];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        dp=new int[N+1][N+1];
        //촌수 계산 배열
        dp1=new int[N+1];

        M=sc.nextInt();
        for(int i=0; i<M; i++){
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            dp[a1][b1]=1;
            dp[b1][a1]=1;
        }
        dfs(a);

        if(dp1[b]==0){
            System.out.println("-1");
        }
        else{
            System.out.println(dp1[b]);
        }

    }
    public static void dfs(int x) {
        Queue<Integer>qx=new LinkedList<>();
        //시작 숫자를 넣는다
        qx.add(x);

        while (!qx.isEmpty()){
            int x1=qx.poll();
            //끝숫자와 같으면 반복문탈출
            if(x1==b){
                break;
            }

            for(int i=1; i<=N; i++){
                //dp배열안의 숫자가 1이고 dp1배열이 0인 조건에만 추가가
               if(dp[x1][i]==1&&dp1[i]==0){

                    qx.add(i);
                    dp1[i]=dp1[x1]+1;
                }
            }
        }
    }

}
