package DFSandBFS.우리피스2번;

import java.util.*;

public class Main {
    static int N;
    static int [][]map;
    static boolean visit[][]=new boolean[1000][1000];
    static int []px={1,-1,0,0};
    static int []py={0,0,1,-1};
    static int answer=0;
    static int answer1=0;
    static Queue<Integer> qx=new LinkedList<>();
    static Queue<Integer>qy=new LinkedList<>();
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();


        map=new int[1000][1000];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
       /* for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.println(map[i][j]);

            }
            System.out.println(" ");

        }*/
        ArrayList<String>s1=new ArrayList<>();
        int index=-1;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(visit[i][j]==false) {
                    bfs(i, j);
                    if(index==-1) {
                        index = map[i][j];
                    }
                    if((answer-1)>answer1){
                        index=map[i][j];
                        answer1=(answer-1);
                    }
                    else if((answer-1)==answer1){

                        if(map[i][j]<index){
                            index=map[i][j];
                        }
                    }

                    answer=0;

                }

            }

        }
        System.out.println(index);
        if(answer1==0){
            answer1=1;
        }
        System.out.println(answer1);




    }
    public static void bfs(int x,int y){
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();

        qx.add(x);
        qy.add(y);

        while (!qx.isEmpty()&&!qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();
            answer++;

            for(int i=0; i<4; i++){
                int x2=x1+px[i];
                int y2=y1+py[i];

                if(x2>=0&&x2<N&&y2>=0&&y2<N){
                    if(visit[x2][y2]==false && map[x][y]==map[x2][y2]){

                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }
            }
        }
    }
}