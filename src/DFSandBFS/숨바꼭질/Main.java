package DFSandBFS.숨바꼭질;

import java.awt.*;
import java.util.*;


//메모리 초과
//다익스트라로 다시 풀기
public class Main {
    static int cnt=0;
    static int N;
    static int M;
    static int dp[][];
    static boolean visit[];
    static Queue<Point>qx=new LinkedList<>();
    static HashMap<Integer,Integer>map=new HashMap<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        dp=new int[N][N];
        visit=new boolean[N];
        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            dp[a-1][b-1]=1;
            dp[b-1][a-1]=1;
        }
        int result[]=new int[3];

        bfs(0);

        ArrayList<Integer>a1=new ArrayList<>(map.keySet());
        Collections.sort(a1,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        result[0]=a1.get(0);
        result[1]=map.get(a1.get(0));
        int answer=0;
        for(int i=0; i<a1.size(); i++){
            int a=map.get(a1.get(0));
            if(a==map.get(a1.get(i))){
                answer++;
            }
        }
        result[2]=answer;
        System.out.println(result[0]+" "+result[1]+" "+result[2]);



    }
    static public void bfs(int x){
        qx.add(new Point(x,0));
        visit[x]=true;

        while (!qx.isEmpty()){
            Point p1=qx.poll();
            int x1=p1.x;
            int y1=p1.y;
            map.put(x1+1,y1);
            for(int i=0; i<N; i++){
                if(dp[x1][i]==1&&visit[i]==false){
                    qx.add(new Point(i,y1+1));
                    visit[i]=true;

                }
            }
        }



    }
}
