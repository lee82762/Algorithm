package 다익스트라.숨바꼭질;

import java.util.*;

//다익스트라 알고리즘 사용
//메모리초과 해결
public class Main {
    static int cnt=0;
    static int max=0;
    static int N;
    static int M;
    static ArrayList<Integer> dp[];
    static Queue<Integer>qx=new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        dp=new ArrayList[N];
        for(int i=0; i<N; i++){
            dp[i]=new ArrayList<>();
        }
        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            dp[a-1].add(b-1);
            dp[b-1].add(a-1);
        }
        bfs(0);

    }
    static public void bfs(int x){
        int count[]=new int[N];
        boolean visit[]=new boolean[N];
        int max=Integer.MIN_VALUE;
        int index=0;
        int max_count=0;
        qx.add(x);
        visit[x]=true;

        while (!qx.isEmpty()){
            int x1=qx.poll();

            for(int idx : dp[x1]){
                if(!visit[idx]){
                    qx.add(idx);
                    visit[idx]=true;
                    count[idx]=count[x1]+1;
                }
            }
        }

        for(int i=0; i<N; i++){
            if(count[i]>max){
                max=count[i];
                index=i;
                max_count=1;
            }
            else if(max==count[i]){
                max_count++;
            }

        }
        System.out.println(index+1+" "+max+" "+max_count);





    }

}
