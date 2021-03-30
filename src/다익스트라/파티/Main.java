package 다익스트라.파티;

import java.util.*;

//간선 뒤집기
//List<List<>> 이해하기
public class Main {
    static int N;
    static int M;
    static int X;
    static ArrayList<Integer>a1=new ArrayList<>();
    static List<List<Node>>list,reverse;
    static int d[];
    static int d1[];


    static class Node implements Comparable<Node> {
        int idx;
        int dis;

        public Node(int idx, int dis) {
            this.idx = idx;
            this.dis = dis;
        }

        public int compareTo(Node n) {
            return this.dis - n.dis;
        }
    }


    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        M=sc.nextInt();
        X=sc.nextInt();


        list=new ArrayList<List<Node>>();
        reverse=new ArrayList<List<Node>>();

        d=new int[N+1];
        d1=new int[N+1];
        Arrays.fill(d,100000000);
        Arrays.fill(d1,100000000);

        for(int i=0; i<=N; i++){
            list.add(new ArrayList<>());
            reverse.add(new ArrayList<>());
        }


        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            list.get(a).add(new Node(b,c));
            reverse.get(b).add(new Node(a,c));
        }

        bfs(list,d,X);
        bfs(reverse,d1,X);

        int max=0;
        for(int i=1; i<=N; i++){
            max=Math.max(max,d[i]+d1[i]);
        }
        System.out.println(max);



    }

    public static void bfs(List<List<Node>> list,int []d,int start){
        PriorityQueue<Node>queue=new PriorityQueue<>();


        boolean visit[]=new boolean[N+1];

        d[start]=0;
        queue.add(new Node(start,d[start]));

        while (!queue.isEmpty()){
            Node p1=queue.poll();
            int x1=p1.idx;
            int y1=p1.dis;
            if(visit[x1])
                continue;

            visit[x1]=true;

            for(Node next:list.get(x1)){
                if(d[next.idx]>d[x1]+next.dis){
                    d[next.idx]=d[x1]+next.dis;
                    queue.add(new Node(next.idx,d[next.idx]));
                }
            }
        }


    }
}